from django.urls import path
from . import views
app_name = 'GradeChange'
urlpatterns = [
    path('', views.GradeChangeRequestView, name='GradeChangeRequest'),
    
    path('teacher/', views.GradeChangeDetail, name='GradeChangeDetail'),
]