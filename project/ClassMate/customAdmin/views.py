from django.shortcuts import render, redirect, get_object_or_404
from user.models import CustomUser, Student, Teacher
from course.models import Course,Prerequisite
from section.models import Section
from feedback.models import Feedback
from library.models import Book,BookIssue
from django.contrib.auth.views import LoginView
from django.urls import reverse_lazy
from django.http import HttpResponse
from ClassMate.decorators import superuser_required
from django.contrib import messages
from django.db.models import Max
from .forms import AddStudentForm,AddTeacherForm,AddCourseForm,AddPrerequisiteForm,AddSectionForm,AddBookForm
from django.core.mail import send_mail
from django.conf import settings
from django.core.exceptions import ImproperlyConfigured
from django.utils import timezone

def send_student_credentials(email, username, password):
    try:
        subject = 'Your ClassMate Account Credentials'
        message = f'Your ClassMate account has been created successfully.\n\nUsername: {username}\nPassword: {password}'
        from_email = settings.EMAIL_HOST_USER  
        
        send_mail(subject, message, from_email, [email])
        return True 
    except Exception as e:
        raise ImproperlyConfigured(f'Error sending email: {e}')

@superuser_required
def studentsDetail(request):
    students = Student.objects.select_related('user').all()

    if request.method == 'POST':
        if 'edit' in request.GET:  # Edit mode
            student_id = request.GET.get('edit')
            student = get_object_or_404(Student, pk=student_id)
            form = AddStudentForm(instance=student.user, data=request.POST)  # Form for editing

            if form.is_valid():
                first_name = form.cleaned_data['first_name']
                last_name = form.cleaned_data['last_name']
                email = form.cleaned_data['email']
                program = form.cleaned_data['program']

                student.user.first_name = first_name
                student.user.last_name = last_name
                student.user.email = email
                student.user.save()

                student.program = program
                student.save()

                messages.success(request, 'Student updated successfully!')
                return redirect('customAdmin:studentsDetail')

        else:  
            form = AddStudentForm(request.POST) 
            if form.is_valid():
                first_name = form.cleaned_data['first_name']
                last_name = form.cleaned_data['last_name']
                email = form.cleaned_data['email']
                program = form.cleaned_data['program']

                username = form.generate_username()
                password = form.generate_password()

                if send_student_credentials(email, username, password):
                    user = CustomUser.objects.create_user(username=username, email=email, first_name=first_name, last_name=last_name, password=password)
                    student = Student.objects.create(user=user, program=program, status='active')
                    messages.success(request, f'Student created successfully! Username: {username} and Password: {password}')
                    return redirect('customAdmin:studentsDetail')
                else:
                    messages.error(request, 'Failed to send email. Please try again.')

    elif request.method == 'GET':
        student_id = request.GET.get('edit') 
        if student_id:
            student = get_object_or_404(Student, pk=student_id)
            form = AddStudentForm(initial={
                'first_name': student.user.first_name,
                'last_name': student.user.last_name,
                'email': student.user.email,
                'program': student.program
            })
        else:
            form = AddStudentForm() 
        if request.GET.get('delete'):
            student_id = request.GET.get('edit')
            if student_id:
                student = get_object_or_404(Student, pk=student_id)
                student.user.delete() 
                messages.success(request, 'Student deleted successfully.')
                return redirect('customAdmin:studentsDetail')

    is_edit_mode = bool(request.GET.get('edit'))
    return render(request, 'customAdmin/student/student.html', {
        'students': students,
        'form': form,
        'is_edit_mode': is_edit_mode,
    })

@superuser_required
def teachersDetail(request):
    teachers = Teacher.objects.select_related('user').all()

    if request.method == 'POST':
        if 'edit' in request.GET:  # Edit mode
            teacher_id = request.GET.get('edit')
            teacher = get_object_or_404(Teacher, pk=teacher_id)
            form = AddTeacherForm(instance=teacher.user, data=request.POST)  

            if form.is_valid():
                first_name = form.cleaned_data['first_name']
                last_name = form.cleaned_data['last_name']
                email = form.cleaned_data['email']
                program = form.cleaned_data['program']
                salary = form.cleaned_data['salary']

                teacher.user.first_name = first_name
                teacher.user.last_name = last_name
                teacher.user.email = email
                teacher.user.save()

                teacher.program = program
                teacher.salary = salary
                teacher.save()

                messages.success(request, 'Teacher updated successfully!')
                return redirect('customAdmin:teachersDetail')

        else:  
            form = AddTeacherForm(request.POST)
            if form.is_valid():
                first_name = form.cleaned_data['first_name']
                last_name = form.cleaned_data['last_name']
                email = form.cleaned_data['email']
                program = form.cleaned_data['program']
                salary = form.cleaned_data['salary']

                username = form.generate_username()
                password = form.generate_password()

                if send_student_credentials(email, username, password): 
                    user = CustomUser.objects.create_user(username=username, email=email, first_name=first_name, last_name=last_name, password=password)
                    teacher = Teacher.objects.create(user=user, program=program, salary=salary, status='active')
                    messages.success(request, f'Teacher created successfully! Username: {username} and Password: {password}')
                    return redirect('customAdmin:teachersDetail')
                else:
                    messages.error(request, 'Failed to send email. Please try again.')

    elif request.method == 'GET':
        teacher_id = request.GET.get('edit')
        if teacher_id:
            teacher = get_object_or_404(Teacher, pk=teacher_id)
            form = AddTeacherForm(initial={
                'first_name': teacher.user.first_name,
                'last_name': teacher.user.last_name,
                'email': teacher.user.email,
                'program': teacher.program,
                'salary': teacher.salary,
            })
        else:
            form = AddTeacherForm()
        if request.GET.get('delete'):
            teacher_id = request.GET.get('edit')
            if teacher_id:
                teacher = get_object_or_404(Teacher, pk=teacher_id)
                teacher.user.delete()
                messages.success(request, 'Teacher deleted successfully.')
                return redirect('customAdmin:teachersDetail')

    is_edit_mode = bool(request.GET.get('edit'))
    return render(request, 'customAdmin/teacher/teacher.html', {
        'teachers': teachers,
        'form': form,
        'is_edit_mode': is_edit_mode,
    })

@superuser_required
def coursesDetail(request):
    courses = Course.objects.all().order_by('recommended_semester', 'course_name')

    if request.method == 'POST':
        if 'edit' in request.GET:  # Edit mode
            course_id = request.GET.get('edit')
            course = get_object_or_404(Course, pk=course_id)
            form = AddCourseForm(instance=course, data=request.POST) 

            if form.is_valid():
                form.save()  
                messages.success(request, 'Course updated successfully!')
                return redirect('customAdmin:coursesDetail')

        else:  
            form = AddCourseForm(request.POST) 
            if form.is_valid():
                form.save() 
                messages.success(request, 'Course created successfully!')
                return redirect('customAdmin:coursesDetail')

    elif request.method == 'GET':
        course_id = request.GET.get('edit') 
        if course_id:
            course = get_object_or_404(Course, pk=course_id)
            form = AddCourseForm(initial={
                'course_code': course.course_code,
                'course_name': course.course_name,
                'description': course.description,
                'credits': course.credits,
                'recommended_semester': course.recommended_semester,
            })
        else:
            form = AddCourseForm() 

        if request.GET.get('delete'):
            course_id = request.GET.get('delete') 
            if course_id:
                course = get_object_or_404(Course, pk=course_id)
                course.delete()
                messages.success(request, 'Course deleted successfully.')
                return redirect('customAdmin:coursesDetail')

    is_edit_mode = bool(request.GET.get('edit'))
    return render(request, 'customAdmin/course/course.html', {
        'courses': courses,
        'form': form,
        'is_edit_mode': is_edit_mode,
    })

@superuser_required
def prerequisitesDetail(request):
    courses = Course.objects.all().order_by('recommended_semester', 'course_name')
    prerequisites = Prerequisite.objects.all()

    if request.method == 'POST':
        form = AddPrerequisiteForm(request.POST)
        if form.is_valid():
            course = form.cleaned_data['course']
            prerequisite = form.cleaned_data['prerequisite']
            Prerequisite.objects.create(course=course, prerequisite=prerequisite)
            messages.success(request, f"{prerequisite.course_name} has been added as a prerequisite for {course.course_name}.")
            return redirect('customAdmin:prerequisitesDetail')
    elif request.method == 'GET' and 'delete' in request.GET:
        prerequisite_id = request.GET.get('delete')
        prerequisite = Prerequisite.objects.filter(id=prerequisite_id).first()
        if prerequisite:
            prerequisite.delete()
            messages.success(request, f"Prerequisite {prerequisite.prerequisite.course_name} has been deleted.")
        return redirect('customAdmin:prerequisitesDetail')
    else:
        form = AddPrerequisiteForm()

    return render(request, 'customAdmin/course/prerequisite.html', {
        'form': form,
        'courses': courses,
        'prerequisites': prerequisites,
    })
    
@superuser_required
def sectionsDetail(request):
    sections = Section.objects.select_related('course', 'teacher').all()

    if request.method == 'POST':
        if 'edit' in request.GET:  
            section_id = request.GET.get('edit')
            section = get_object_or_404(Section, pk=section_id)
            form = AddSectionForm(instance=section, data=request.POST)

            if form.is_valid():
                form.save()
                messages.success(request, 'Section updated successfully!')
                return redirect('customAdmin:sectionsDetail')
        else:  
            form = AddSectionForm(request.POST)
            if form.is_valid():
                course = form.cleaned_data['course']
                last_section = Section.objects.filter(course=course).order_by('-section_label').first()
                next_label = chr(ord(last_section.section_label) + 1) if last_section else 'A'

                section = form.save(commit=False)
                section.section_label = next_label
                section.finalized = False
                section.save()

                messages.success(request, f'Section {next_label} added successfully!')
                return redirect('customAdmin:sectionsDetail')

    elif request.method == 'GET':
        section_id = request.GET.get('edit')
        if section_id:
            section = get_object_or_404(Section, pk=section_id)
            form = AddSectionForm(instance=section)
        else:
            form = AddSectionForm()

        if request.GET.get('delete'):
            section_id = request.GET.get('edit')
            if section_id:
                section = get_object_or_404(Section, pk=section_id)
                section.delete()
                messages.success(request, 'Section deleted successfully.')
                return redirect('customAdmin:sectionsDetail')

    is_edit_mode = bool(request.GET.get('edit'))
    return render(request, 'customAdmin/section/section.html', {
        'sections': sections,
        'form': form,
        'is_edit_mode': is_edit_mode,
    })

@superuser_required
def feedbackDetail(request):
    feedbacks = Feedback.objects.select_related('student', 'section').all()

    if request.method == 'POST':
        feedback_id = request.POST.get('feedback_id')
        feedback = get_object_or_404(Feedback, pk=feedback_id)
        
        if 'star' in request.POST:
            feedback.starred = not feedback.starred
            feedback.save()
            messages.success(request, 'Feedback updated successfully!')
        elif 'disregard' in request.POST:
            feedback.delete()
            messages.success(request, 'Feedback disregarded successfully!')

        return redirect('customAdmin:feedbackDetail')

    return render(request, 'customAdmin/feedback/feedback.html', {
        'feedbacks': feedbacks,
    })

def booksDetail(request):
    books = Book.objects.all()

    if request.method == 'POST':
        if 'edit' in request.GET:  # Edit mode
            book_id = request.GET.get('edit')
            book = get_object_or_404(Book, pk=book_id)
            form = AddBookForm(instance=book, data=request.POST)

            if form.is_valid():
                form.save()
                messages.success(request, 'Book updated successfully!')
                return redirect('customAdmin:booksDetail')

        else:  # Add mode
            form = AddBookForm(request.POST)
            if form.is_valid():
                form.save()
                messages.success(request, 'Book added successfully!')
                return redirect('customAdmin:booksDetail')

    elif request.method == 'GET':
        book_id = request.GET.get('edit')  # Check for edit mode
        if book_id:
            book = get_object_or_404(Book, pk=book_id)
            form = AddBookForm(instance=book)
        else:
            form = AddBookForm()

        if request.GET.get('delete'):  # Handle delete action
            book_id = request.GET.get('edit')
            if book_id:
                book = get_object_or_404(Book, pk=book_id)
                book.delete()
                messages.success(request, 'Book deleted successfully.')
                return redirect('customAdmin:booksDetail')

    is_edit_mode = bool(request.GET.get('edit'))
    return render(request, 'customAdmin/library/book.html', {
        'books': books,
        'form': form,
        'is_edit_mode': is_edit_mode,
    })

@superuser_required
def issuedBooksDetail(request):
    book_issues = BookIssue.objects.filter(is_returned=False).select_related('book', 'student')

    if request.method == 'POST':
        issue_id = request.POST.get('issue_id')
        if issue_id:
            issue = get_object_or_404(BookIssue, pk=issue_id)
            issue.is_returned = True
            issue.return_date = timezone.now()
            issue.save()
            messages.success(request, f"Book '{issue.book.title}' marked as returned.")
            return redirect('customAdmin:issuedBooksDetail')

    return render(request, 'customAdmin/library/issued_books.html', {'book_issues': book_issues})

class SuperUserLoginView(LoginView):
    template_name = 'customAdmin/login.html'
    
    def dispatch(self, *args, **kwargs):
        return super().dispatch(*args, **kwargs)

    def get_success_url(self):
        return reverse_lazy('customAdmin:studentsDetail') 

