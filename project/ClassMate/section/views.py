from django.shortcuts import render, redirect, get_object_or_404
from django.contrib import messages
from django.contrib.auth.decorators import login_required
from django.db.models import F, Count, Sum
from .models import Section, Enrollment
from course.models import Prerequisite

@login_required
def sections_list(request):
    student = request.user.student
    sections = Section.objects.select_related('course', 'teacher').annotate(
        enrolled_students=Count('enrollment'),
        available_seats=F('capacity') - Count('enrollment')
    )

    for section in sections:
        section.available_seats = max(0, section.capacity - section.enrolled_students)
        
        section.missing_prereqs = get_missing_prerequisites(student, section.course)
        
        section.current_credits = get_current_credits(student)
        section.would_exceed_credits = section.current_credits + section.course.credits > 18

        section.can_enroll = (
            section.available_seats > 0 and 
            not section.missing_prereqs and 
            not section.would_exceed_credits
        )
        
    return render(request, 'section/sections_list.html', {'sections': sections})

@login_required
def enroll_section(request, section_id):
    if request.method == 'POST':
        student = request.user.student
        section = get_object_or_404(Section, id=section_id)

        already_enrolled_or_completed = Enrollment.objects.filter(
            student=student,
            section__course=section.course,
            status__in=['Enrolled', 'Completed']  
        ).exists()

        if already_enrolled_or_completed:
            messages.error(request, f"You have already enrolled in or completed the course: {section.course.course_name}")
            return redirect('sections_list')

        enrolled_count = Enrollment.objects.filter(section=section, status='Enrolled').count()
        if enrolled_count >= section.capacity:
            messages.error(request, "Sorry, this section is full.")
            return redirect('sections_list')

        current_credits = get_current_credits(student)
        if current_credits + section.course.credits > 18:
            messages.error(request, "Enrollment would exceed 18 credit hours limit.")
            return redirect('sections_list')

        missing_prereqs = get_missing_prerequisites(student, section.course)
        if missing_prereqs:
            message = "Missing prerequisites: " + ", ".join(missing_prereqs)
            messages.error(request, message)
            return redirect('sections_list')

        # Enroll the student in the section
        Enrollment.objects.create(student=student, section=section)
        messages.success(request, f"Successfully enrolled in {section.course.course_name}")
        return redirect('sections_list')







def get_current_credits(student):
    return Enrollment.objects.filter(
        student=student, 
        status='Enrolled'
    ).aggregate(total_credits=Sum('section__course__credits'))['total_credits'] or 0

def get_missing_prerequisites(student, course):
    prerequisites = Prerequisite.objects.filter(course=course)
    missing_prereqs = []
    for prereq in prerequisites:
        completed_courses = Enrollment.objects.filter(
            student=student, 
            section__course=prereq.prerequisite,
            status='Completed'
        )
        if not completed_courses.exists():
            missing_prereqs.append(prereq.prerequisite.course_name)
    return missing_prereqs