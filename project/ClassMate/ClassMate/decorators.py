from functools import wraps
from django.http import HttpResponseForbidden
from django.shortcuts import redirect
from user.models import Student, Teacher

def student_required(view_func):
    @wraps(view_func)
    def _wrapped_view(request, *args, **kwargs):
        if hasattr(request.user, 'student') and not request.user.is_superuser:
            return view_func(request, *args, **kwargs)
        return HttpResponseForbidden("You do not have access to student pages")
    return _wrapped_view

def teacher_required(view_func):
    @wraps(view_func)
    def _wrapped_view(request, *args, **kwargs):
        if hasattr(request.user, 'teacher') and not request.user.is_superuser:
            return view_func(request, *args, **kwargs)
        return HttpResponseForbidden("You do not have access to teacher pages")
    return _wrapped_view

def superuser_required(view_func):
    def _wrapped_view(request, *args, **kwargs):
        if request.user.is_superuser:
            return view_func(request, *args, **kwargs)
        return HttpResponseForbidden("You are not a superuser. Access is denied.")
    return _wrapped_view
