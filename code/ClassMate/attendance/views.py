from django.shortcuts import render
from django.http import HttpResponseForbidden
from django.http import JsonResponse
from django.shortcuts import redirect
from django.utils.timezone import now
from django.contrib.auth.decorators import login_required
from .models import Attendance
from section.models import Section, Enrollment
from ClassMate.decorators import teacher_required,student_required
from django.db import connection

@login_required
@student_required
def show_attendance(request, section_id=None):
    student = request.user.student

    # enrollments = Enrollment.objects.select_related('section').filter(
    #     student=student,
    #     status='Enrolled'
    # )

    # sections = [enrollment.section for enrollment in enrollments] 
    student_id = request.user.student.id

    enrollments = Enrollment.objects.raw(
        'SELECT * FROM section_enrollment WHERE student_id = %s AND status = %s',
        [student_id, 'Enrolled']
    )

    sections = [enrollment.section for enrollment in enrollments]


    if not sections:
        return render(request, 'attendance/no_sections.html')

    if section_id:
        # current_section = Section.objects.filter(id=section_id).first()
        current_section = next(iter(Section.objects.raw('SELECT * FROM section_section WHERE id = %s LIMIT 1', [section_id])), None)
    else:
        current_section = sections[0] if sections else None

    attendance_records = []
    percentage = 100  
    if current_section:
        # attendance_records = Attendance.objects.filter(student=student,section=current_section).order_by('date')
        attendance_records = Attendance.objects.raw(
            '''
            SELECT * FROM attendance_attendance
            WHERE student_id = %s AND section_id = %s
            ORDER BY date
            ''',
            [student.id, current_section.id]
        )


        # total_days = attendance_records.count()
        # present_days = attendance_records.filter(status='P').count()
        # late_days = attendance_records.filter(status='L').count()

        def execute_raw_query(query, params):
            with connection.cursor() as cursor:
                cursor.execute(query, params)
                result = cursor.fetchone()
            return result

        student_id = student.id
        section_id = current_section.id

        total_days_query = '''
            SELECT COUNT(*) as total_days
            FROM attendance_attendance
            WHERE student_id = %s AND section_id = %s
        '''

        total_days_result = execute_raw_query(total_days_query, [student_id, section_id])
        total_days = total_days_result[0] if total_days_result else 0

        present_days_query = '''
            SELECT COUNT(*) as present_days
            FROM attendance_attendance
            WHERE student_id = %s AND section_id = %s AND status = 'P'
        '''

        present_days_result = execute_raw_query(present_days_query, [student_id, section_id])
        present_days = present_days_result[0] if present_days_result else 0

        late_days_query = '''
            SELECT COUNT(*) as late_days
            FROM attendance_attendance
            WHERE student_id = %s AND section_id = %s AND status = 'L'
        '''

        late_days_result = execute_raw_query(late_days_query, [student_id, section_id])
        late_days = late_days_result[0] if late_days_result else 0

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
    # teacher = request.user.teacher
    # sections = Section.objects.filter(teacher=teacher)
    teacher_id = request.user.teacher.id
    sections = Section.objects.raw('SELECT * FROM section_section WHERE teacher_id = %s', [teacher_id])

    if not sections:
        return render(request, 'attendance/no_sections.html')

    if section_id:
        # current_section = Section.objects.filter(id=section_id).first()
        current_section = next(iter(Section.objects.raw('SELECT * FROM section_section WHERE id = %s LIMIT 1', [section_id])), None)
    else:
        current_section = sections[0] if sections else None

    # students = Enrollment.objects.filter(section=current_section)
    students = Enrollment.objects.raw('SELECT * FROM section_enrollment WHERE section_id = %s', [current_section.id])

    # attendance_dates = Attendance.objects.filter(section=current_section).values_list('date', flat=True).distinct()
    attendance_dates = Attendance.objects.raw(
        'SELECT DISTINCT id, date FROM attendance_attendance WHERE section_id = %s', 
        [current_section.id]
    )
    attendance_dates = [attendance.date for attendance in attendance_dates]

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
    # teacher = request.user.teacher
    # section = Section.objects.filter(id=section_id, teacher=teacher).first()

    teacher_id = request.user.teacher.id
    section_query = Section.objects.raw(
        'SELECT * FROM section_section WHERE id = %s AND teacher_id = %s LIMIT 1',
        [section_id, teacher_id]
    )
    section = next(iter(section_query), None)


    if not section:
        return HttpResponseForbidden("You do not have access to this section.")

    # attendance_records = Attendance.objects.filter(section=section, date=date)
    attendance_records = Attendance.objects.raw(
        'SELECT * FROM attendance_attendance WHERE section_id = %s AND date = %s',
        [section.id, date]
    )

    
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
