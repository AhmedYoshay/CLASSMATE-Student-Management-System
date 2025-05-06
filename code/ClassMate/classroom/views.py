from django.shortcuts import get_object_or_404, render, redirect
from django.http import JsonResponse
from django.contrib.auth.decorators import login_required
from django.views.decorators.csrf import csrf_exempt
from django.utils.timezone import now
from .models import Classroom, Assignment, Submission, Post
import json

@login_required
def home(request):
    if hasattr(request.user, 'teacher'):  # if user has a teacher profile
        classrooms = Classroom.objects.filter(teacher=request.user)
        due_assignments = []  # Teachers don't have due assignments

        #return render(request, 'classroom/teacher_dashboard.html', {'classrooms': classrooms})
    elif hasattr(request.user, 'student'):  # if user has a student profile
        classrooms = Classroom.objects.filter(students=request.user)
        assignments = Assignment.objects.filter(classroom__in=classrooms)
        # Filter assignments that are not yet submitted and deadline is not over
        due_assignments = assignments.exclude(
            submissions__student=request.user
        ).filter(deadline__gt=now())

        #return render(request, 'classroom/student_dashboard.html', {'classrooms': classrooms})
    return render(request, 'classroom/home.html', {
        'classrooms': classrooms,
        'due_assignments': due_assignments
        })

@login_required
def classroom_detail(request, classroom_id):
    classroom = get_object_or_404(Classroom, id=classroom_id)
    posts = classroom.posts.all()
    assignments = classroom.assignments.all()

    # Check submissions for the logged-in student
    if request.user != classroom.teacher:  # Only for students
        student_submissions = Submission.objects.filter(student=request.user, assignment__in=assignments)
        submitted_assignments = {submission.assignment.id for submission in student_submissions}
    else:
        submitted_assignments = set()  # Teachers don't have submissions
    
    current_time = now()

    return render(request, 'classroom/classroom_detail.html', {
        'classroom': classroom,
        'posts': posts,
        'assignments': assignments,
        'submitted_assignments': submitted_assignments,
        'current_time': current_time

    })
    
@login_required
def create_classroom(request):
    if request.method == 'POST' and request.user.teacher:  # Check if user is a teacher
        name = request.POST.get('name')
        code = request.POST.get('code')
        classroom = Classroom.objects.create(
            name=name,
            code=code,
            teacher=request.user
        )
        return JsonResponse({'message': 'Classroom created successfully', 'classroom_id': classroom.id}, status=201)
    return JsonResponse({'error': 'Unauthorized or invalid request'}, status=403)

@login_required
def join_classroom(request):
    if request.method == 'POST':
        code = request.POST.get('code')
        classroom = get_object_or_404(Classroom, code=code)
        classroom.students.add(request.user)
        return JsonResponse({'message': 'Joined classroom successfully'}, status=200)
    return JsonResponse({'error': 'Invalid request'}, status=400)

@login_required
def create_post(request, classroom_id):
    if request.method == 'POST':
        classroom = get_object_or_404(Classroom, id=classroom_id)
        if request.user == classroom.teacher:
            content = request.POST.get('content')
            post = Post.objects.create(
                classroom=classroom,
                author=request.user,
                content=content
            )
            posts = classroom.posts.all()
            assignments = classroom.assignments.all()
            return render(request, 'classroom/classroom_detail.html', {
        'classroom': classroom,
        'posts': posts,
        'assignments': assignments
    })
        return JsonResponse({'error': 'Unauthorized'}, status=403)
    return JsonResponse({'error': 'Invalid request'}, status=400)

@login_required
def create_assignment(request, classroom_id):
    if request.method == 'POST':
        classroom = get_object_or_404(Classroom, id=classroom_id)
        if request.user == classroom.teacher:
            title = request.POST.get('title')
            description = request.POST.get('description')
            deadline = request.POST.get('deadline')
            assignment = Assignment.objects.create(
                classroom=classroom,
                title=title,
                description=description,
                deadline=deadline
            )
            posts = classroom.posts.all()
            assignments = classroom.assignments.all()
            return render(request, 'classroom/classroom_detail.html', {
        'classroom': classroom,
        'posts': posts,
        'assignments': assignments
    })
        return JsonResponse({'error': 'Unauthorized'}, status=403)
    return JsonResponse({'error': 'Invalid request'}, status=400)

@login_required
def submit_assignment(request,classroom_id, assignment_id):
    if request.method == 'POST':
        assignment = get_object_or_404(Assignment, id=assignment_id)
        if now() > assignment.deadline:
            return JsonResponse({'error': 'Deadline has passed'}, status=403)
        file = request.FILES['file']
        submission = Submission.objects.create(
            assignment=assignment,
            student=request.user,
            file=file
        )
        classroom = get_object_or_404(Classroom, id=classroom_id)
        assignments = classroom.assignments.all()

        student_submissions = Submission.objects.filter(student=request.user, assignment__in=assignments)
        submitted_assignments = {submission.assignment.id for submission in student_submissions}
        posts = classroom.posts.all()
        return render(request, 'classroom/classroom_detail.html', {
            'classroom': classroom,
            'posts': posts,
            'assignments': assignments,
            'submitted_assignments': submitted_assignments
        })
    return JsonResponse({'error': 'Invalid request'}, status=400)

@login_required
def view_submissions(request, assignment_id):
    # Get the assignment object
    assignment = get_object_or_404(Assignment, id=assignment_id)
    
    # Check if the current user is the teacher of the classroom
    if request.user != assignment.classroom.teacher:
        return render(request, '403.html', status=403)  # Return a 403 error page for unauthorized access
    
    # Get all submissions for the assignment
    submissions = Submission.objects.filter(assignment=assignment)
    
    # Render the submissions page
    return render(request, 'classroom/view_submissions.html', {
        'assignment': assignment,
        'submissions': submissions
    })