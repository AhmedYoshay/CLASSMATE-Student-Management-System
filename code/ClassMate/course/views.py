from django.shortcuts import render
from .models import Course
from ClassMate.decorators import teacher_required,student_required
from django.contrib.auth.decorators import login_required

@login_required
@student_required
def course_list(request):
    courses = Course.objects.all()
    return render(request, 'course/course_list.html', {'courses': courses})
