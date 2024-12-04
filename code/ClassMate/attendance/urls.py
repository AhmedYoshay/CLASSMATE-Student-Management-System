from django.urls import path
from . import views

urlpatterns = [
    path('<int:section_id>/', views.show_attendance, name='show_attendance'),
    path('', views.show_attendance, name='show_attendance'),
    path('teacher/', views.teacher_attendance, name='teacher_attendance'),
    path('teacher/<int:section_id>/', views.teacher_attendance, name='teacher_attendance'),
    path('attendance/teacher/<int:section_id>/<str:date>/', views.teacher_attendance_date, name='teacher_attendance_date'),
]
