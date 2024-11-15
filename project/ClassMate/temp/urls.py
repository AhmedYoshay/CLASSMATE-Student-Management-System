from django.urls import path
from . import views
from django.conf import settings
from django.conf.urls.static import static

urlpatterns = [
    path('', views.index1, name='index1'), 
    path('insert_user/', views.insert_user, name='insert_user'),
]