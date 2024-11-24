from django.shortcuts import render
from django.contrib.auth.decorators import login_required
from .models import Attendance
from section.models import Section, Enrollment

@login_required
def show_attendance(request, section_id=None):
    student = request.user.student

    # Get the enrollments of the student for sections where the status is 'Enrolled'
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
        attendance_records = Attendance.objects.filter(section=current_section).order_by('date')

        total_days = attendance_records.count()
        present_days = attendance_records.filter(status='P').count()
        late_days = attendance_records.filter(status='L').count()
        present_days = present_days - late_days//3
        
        if total_days > 0:
            percentage = (present_days / total_days) * 100

    return render(request, 'attendance/attendance.html', {
        'sections': sections,
        'current_section': current_section,
        'attendance_records': attendance_records,
        'percentage': percentage,  
    })
