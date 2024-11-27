from django.shortcuts import render
from django.http import HttpResponseForbidden
from django.http import JsonResponse
from django.shortcuts import redirect
from django.utils.timezone import now
from django.contrib.auth.decorators import login_required
from .models import Attendance
from section.models import Section, Enrollment
from ClassMate.decorators import teacher_required,student_required

@login_required
@student_required
def show_attendance(request, section_id=None):
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

    attendance_records = []
    percentage = 100  
    if current_section:
        attendance_records = Attendance.objects.filter(student=student,section=current_section).order_by('date')

        total_days = attendance_records.count()
        present_days = attendance_records.filter(status='P').count()
        late_days = attendance_records.filter(status='L').count()
        present_days = present_days - late_days//3
        
        if total_days > 0:
            percentage = (present_days / total_days) * 100

    return render(request, 'attendance/student/attendance.html', {
        'sections': sections,
        'current_section': current_section,
        'attendance_records': attendance_records,
        'percentage': percentage,  
    })

@login_required
@teacher_required
def teacher_attendance(request, section_id=None):
    teacher = request.user.teacher
    sections = Section.objects.filter(teacher=teacher)

    if not sections:
        return render(request, 'attendance/no_sections.html')

    if section_id:
        current_section = Section.objects.filter(id=section_id).first()
    else:
        current_section = sections[0] if sections else None

    students = Enrollment.objects.filter(section=current_section)

    attendance_dates = Attendance.objects.filter(section=current_section).values_list('date', flat=True).distinct()

    if request.method == 'POST':
        selected_date = request.POST.get('date')
        if selected_date:
            from datetime import datetime
            selected_date = datetime.strptime(selected_date, '%Y-%m-%d').date()

            for student in students:
                Attendance.objects.get_or_create(
                    student=student.student, 
                    section=current_section,
                    date=selected_date,
                    defaults={'status': 'U'}
                )

            return redirect('teacher_attendance', section_id=current_section.id)

    return render(request, 'attendance/teacher/attendance.html', {
        'sections': sections,
        'current_section': current_section,
        'students': students,
        'attendance_dates': attendance_dates,
    })
    
    
@login_required
@teacher_required
def teacher_attendance_date(request, section_id, date):
    teacher = request.user.teacher
    section = Section.objects.filter(id=section_id, teacher=teacher).first()

    if not section:
        return HttpResponseForbidden("You do not have access to this section.")

    attendance_records = Attendance.objects.filter(section=section, date=date)
    
    
    if request.method == "POST":
        for record in attendance_records:
            status = request.POST.get(f"status_{record.student.id}")
            if status in ['P', 'A', 'L', 'U']:
                record.status = status
                record.save()
        return redirect('teacher_attendance_date', section_id=section_id, date=date)

    return render(request, 'attendance/teacher/attendance_date.html', {
        'section': section,
        'date': date,
        'attendance_records': attendance_records,
    })
