from django.urls import path
from . import views

urlpatterns = [
    path('<int:section_id>/', views.show_marks, name='show_marks'),
    path('', views.show_marks, name='show_marks'),
    path('teacher/', views.teacher_marks, name='teacher_marks'),
    path('teacher/<int:section_id>/', views.teacher_marks, name='teacher_marks'),
    path('teacher/<int:section_id>/<int:subcategory_id>/', views.enter_marks, name='enter_marks'),
    path('submit_grades/<int:section_id>/', views.submit_grades, name='submit_grades'),
    path('transcript/', views.transcript_view, name='transcript_view'),
]   
