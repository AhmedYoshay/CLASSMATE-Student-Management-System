from django.urls import path
from . import views

urlpatterns = [
    path('<int:section_id>/', views.show_marks, name='show_marks'),
    path('', views.show_marks, name='show_marks'),
]
