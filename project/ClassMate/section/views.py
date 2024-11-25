from django.shortcuts import render, redirect, get_object_or_404
from django.contrib import messages
from django.contrib.auth.decorators import login_required
from django.db.models import F, Count, Sum
from .models import Section, Enrollment
from course.models import Prerequisite
from django.contrib.auth import authenticate
from django.contrib.messages import get_messages
from ClassMate.decorators import teacher_required,student_required

@login_required
@student_required
def sections_list(request):
    student = request.user.student
    sections = Section.objects.select_related('course', 'teacher').annotate(
        enrolled_students=Count('enrollment'),
    )

    for section in sections:
        section.available_seats = max(0, section.capacity - section.enrolled_students)
        section.available_seats = int(section.available_seats) 
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
@student_required
def enroll_section(request, section_id):
    student = request.user.student
    section = get_object_or_404(Section, id=section_id)

    enrolled_students_count = Enrollment.objects.filter(section=section, status='Enrolled').count()
    available_seats = max(0, section.capacity - enrolled_students_count)

    if available_seats <= 0:
        messages.error(request, "Sorry, this section is full.")
        return redirect('sections_list')

    missing_prereqs = get_missing_prerequisites(student, section.course)
    if missing_prereqs:
        message = "Missing prerequisites: " + ", ".join(missing_prereqs)
        messages.error(request, message)
        return redirect('sections_list')

    current_credits = get_current_credits(student)
    if current_credits + section.course.credits > 18:
        messages.error(request, "Enrollment would exceed 18 credit hours limit.")
        return redirect('sections_list')
    
    already_enrolled_or_completed = Enrollment.objects.filter(
        student=student,
        section__course=section.course,
        status__in=['Enrolled', 'Completed']
    ).exists()

    if already_enrolled_or_completed:
        messages.error(request, f"You have already enrolled in or completed the course: {section.course.course_name}")
        return redirect('sections_list')

    Enrollment.objects.create(student=student, section=section, status='Enrolled')
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


@login_required
@student_required
def enrolled_sections(request):
    student = request.user.student
    enrollments = Enrollment.objects.select_related('section').filter(
        student = student,
        status = 'Enrolled'
    )

    return render(request, 'section/enrolled_sections.html', {'enrollments': enrollments})

@login_required
@student_required
def withdraw_section(request, enrollment_id):
    student = request.user.student
    enrollment = get_object_or_404(Enrollment, id=enrollment_id, student=student, status='Enrolled')

    if request.method == 'POST':
        password = request.POST.get('password')
        user = authenticate(username=request.user.username, password=password)

        if user is None:
            messages.error(request, "Incorrect password. Please try again.")
            return redirect('withdraw_section', enrollment_id=enrollment_id)

        # Delete the enrollment from the database
        enrollment.delete()
        messages.success(request, f"You have successfully withdrawn from {enrollment.section.course.course_name}")
        return redirect('enrolled_sections')

    # Clear all existing messages to ensure no carry-over
    storage = get_messages(request)
    for _ in storage:
        pass

    return render(request, 'section/confirm_withdraw.html', {'enrollment': enrollment})
