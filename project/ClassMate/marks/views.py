from django.shortcuts import render
from django.contrib.auth.decorators import login_required
from .models import Heading,Subcategory,MarksEntry
from section.models import Section, Enrollment
from ClassMate.decorators import teacher_required,student_required
from django.db.models import Avg, Max, Min, Count

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
                student_marks = MarksEntry.objects.filter(student=student, subcategory=subcategory).first()
                if student_marks:
                    obtained_weighted_marks += (
                        (student_marks.marks / subcategory.total_marks) * subcategory.weightage
                    )
                all_marks = MarksEntry.objects.filter(subcategory=subcategory).aggregate(
                    min_marks=Min('marks'),
                    max_marks=Max('marks'),
                    avg_marks=Avg('marks'),
                )
                subcategory_data.append({
                    'subcategory': subcategory,
                    'student_marks': student_marks.marks if student_marks else '-',
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
                    if student_entry:
                        total_student_marks += (
                            (student_entry.marks / subcategory.total_marks) * subcategory.weightage
                        )
                student_percentages.append(total_student_marks)

            user_percentile = (
                sum(1 for percentage in student_percentages if percentage <= obtained_weighted_marks)
                / len(student_percentages)
            ) * 100

            analysis_data = {
                'total_weightage': total_weightage,
                'obtained_weightage': round(obtained_weighted_marks, 2),
                'user_percentile': round(user_percentile, 2),
                'class_avg': round(sum(student_percentages) / len(student_percentages), 2),
            }

    return render(request, 'marks/marks.html', {
        'sections': sections,
        'current_section': current_section,
        'marks_data': marks_data,
        'analysis_data': analysis_data,
    })

