from django.shortcuts import render
from django.http import HttpResponse,HttpResponseForbidden
from django.contrib.auth.decorators import login_required
from .models import Heading, Subcategory, MarksEntry
from section.models import Section, Enrollment
from ClassMate.decorators import teacher_required, student_required
from django.db.models import Avg, Max, Min
from statistics import stdev
from decimal import Decimal
import json
from django.urls import reverse
from django.http import HttpResponseRedirect

@login_required
@student_required
def show_marks(request, section_id=None):
    student = request.user.student

    enrollments = Enrollment.objects.select_related('section').filter(
        student=student,
        status='Enrolled'
    )

    sections = [enrollment.section for enrollment in enrollments]

    if not sections:
        return render(request, 'attendance/no_sections.html')

    if section_id:
        current_section = Section.objects.filter(id=section_id).first()
    else:
        current_section = sections[0] if sections else None

    marks_data = []
    analysis_data = None

    if current_section:
        headings = Heading.objects.filter(section=current_section)
        total_weightage = 0
        obtained_weighted_marks = 0
        student_percentages = []

        for heading in headings:
            subcategories = Subcategory.objects.filter(heading=heading)
            subcategory_data = []
            for subcategory in subcategories:
                total_weightage += subcategory.weightage
                
                # Fetching the student's marks for the subcategory
                student_marks = MarksEntry.objects.filter(student=student, subcategory=subcategory).first()
                
                # Ensure marks is not None before performing calculations
                if student_marks and student_marks.marks is not None:
                    obtained_weighted_marks += (
                        (student_marks.marks / subcategory.total_marks) * subcategory.weightage
                    )
                else:
                    # If marks is None, treat it as 0 for calculation purposes
                    obtained_weighted_marks += 0

                # Aggregate marks for min, max, and avg calculation
                all_marks = MarksEntry.objects.filter(subcategory=subcategory).aggregate(
                    min_marks=Min('marks'),
                    max_marks=Max('marks'),
                    avg_marks=Avg('marks'),
                )

                # Ensure there are valid values for min, max, avg marks
                subcategory_data.append({
                    'subcategory': subcategory,
                    'student_marks': student_marks.marks if student_marks and student_marks.marks is not None else '-',
                    'min_marks': all_marks['min_marks'] if all_marks['min_marks'] is not None else '-',
                    'max_marks': all_marks['max_marks'] if all_marks['max_marks'] is not None else '-',
                    'avg_marks': round(all_marks['avg_marks'], 2) if all_marks['avg_marks'] is not None else '-',
                })

            marks_data.append({
                'heading': heading,
                'subcategories': subcategory_data,
            })



        if total_weightage > 0:
            class_students = Enrollment.objects.filter(
                section=current_section, status='Enrolled'
            ).select_related('student')
            
            for enrolled_student in class_students:
                total_student_marks = 0
                for subcategory in Subcategory.objects.filter(heading__section=current_section):
                    student_entry = MarksEntry.objects.filter(student=enrolled_student.student, subcategory=subcategory).first()
                    if student_entry and student_entry.marks is not None:
                        total_student_marks += (
                            (student_entry.marks / subcategory.total_marks) * subcategory.weightage
                        )
                student_percentages.append(total_student_marks)

            class_std_dev = round(stdev(student_percentages), 2) if len(student_percentages) > 1 else 0

            analysis_data = {
                'total_weightage': total_weightage,
                'obtained_weightage': round(obtained_weighted_marks, 2),
                'class_std_dev': class_std_dev,
                'class_avg': round(sum(student_percentages) / len(student_percentages), 2),
            }
            analysis_data = {key: float(value) if isinstance(value, Decimal) else value for key, value in analysis_data.items()}

    return render(request, 'marks/student/marks.html', {
        'sections': sections,
        'current_section': current_section,
        'marks_data': marks_data,
        'analysis_data': json.dumps(analysis_data),
    })


@login_required
@teacher_required
def teacher_marks(request, section_id=None):
    teacher = request.user.teacher
    sections = Section.objects.filter(teacher=teacher)

    if not sections:
        return render(request, 'attendance/no_sections.html')

    if section_id:
        current_section = Section.objects.filter(id=section_id).first()
    else:
        current_section = sections[0] if sections else None

    headings = Heading.objects.filter(section=current_section).prefetch_related('subcategories') if current_section else []

    if request.method == 'POST':
        # Adding a new heading
        new_heading_name = request.POST.get('heading_name')
        if new_heading_name:
            heading = Heading.objects.create(name=new_heading_name, section=current_section)
        
        # Adding a new subcategory
        heading_id = request.POST.get('heading_id')
        subcategory_name = request.POST.get('subcategory_name')
        total_marks = request.POST.get('total_marks')
        weightage = request.POST.get('weightage')

        if heading_id and subcategory_name and total_marks and weightage:
            try:
                heading = Heading.objects.get(id=heading_id)
                subcategory = Subcategory.objects.create(
                    heading=heading,
                    name=subcategory_name,
                    total_marks=Decimal(total_marks),
                    weightage=Decimal(weightage),
                )
                
                # Create MarksEntry for each student in the section with a default mark of None (or null)
                students_in_section = Enrollment.objects.filter(section=current_section, status='Enrolled')
                for enrollment in students_in_section:
                    MarksEntry.objects.create(
                        student=enrollment.student,
                        subcategory=subcategory,
                        marks=None  
                    )

            except Heading.DoesNotExist:
                pass

    return render(request, 'marks/teacher/marks.html', {
        'sections': sections,
        'current_section': current_section,
        'headings': headings,
    })



@login_required
@teacher_required
def enter_marks(request, section_id, subcategory_id):
    teacher = request.user.teacher
    section = Section.objects.filter(id=section_id, teacher=teacher).first()
    
    if not section:
        return HttpResponseForbidden("You do not have access to this section.")
    
    # Get the subcategory and total marks for the subcategory
    subcategory = Subcategory.objects.filter(id=subcategory_id).first()
    if not subcategory:
        return HttpResponseForbidden("This subcategory does not exist.")
    
    total_marks = subcategory.total_marks  # Total marks for the subcategory
    
    # Get all the marks entries for this subcategory
    marks_entries = MarksEntry.objects.filter(subcategory_id=subcategory_id)
    
    # Handle form submission for updating marks
    if request.method == 'POST':
        for entry in marks_entries:
            # Retrieve the new marks from the form
            new_marks = request.POST.get(f'marks_{entry.id}')
            if new_marks:
                # Update the entry's marks if a new value is provided
                entry.marks = Decimal(new_marks)
                entry.save()
        
        redirect_url = reverse('teacher_marks', args=[section_id])

# Redirect the user to the section page without the subcategory
        return HttpResponseRedirect(redirect_url)

    
    return render(request, 'marks/teacher/enter_marks.html', {
        'section': section,
        'marks_entries': marks_entries,
        'subcategory': subcategory,
        'total_marks': total_marks,  # Pass total marks to the template
    })
