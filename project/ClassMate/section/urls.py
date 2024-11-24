from django.urls import path
from . import views

urlpatterns = [
    path('', views.sections_list, name='sections_list'),
    path('enroll/<int:section_id>/', views.enroll_section, name='enroll_section'),
    path('enrolled/', views.enrolled_sections, name='enrolled_sections'),
    path('withdraw/<int:enrollment_id>/', views.withdraw_section, name='withdraw_section'),
]
