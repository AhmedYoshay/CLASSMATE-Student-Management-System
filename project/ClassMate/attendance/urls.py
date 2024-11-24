from django.urls import path
from . import views

urlpatterns = [
    path('<int:section_id>/', views.show_attendance, name='show_attendance'),
    path('', views.show_attendance, name='show_attendance'),
]
