from django.urls import path
from . import views
#from django.conf import settings
#from django.conf.urls.static import static

urlpatterns = [
    path('', views.home, name='home'),
    path('classroom/<int:classroom_id>/', views.classroom_detail, name='classroom_detail'), 
    path('create-classroom/', views.create_classroom, name='create_classroom'),
    path('join-classroom/', views.join_classroom, name='join_classroom'),
    path('classroom/<int:classroom_id>/create-post/', views.create_post, name='create_post'),
    path('classroom/<int:classroom_id>/create-assignment/', views.create_assignment, name='create_assignment'),
    path('assignment/<int:classroom_id>/<int:assignment_id>/submit/', views.submit_assignment, name='submit_assignment'),
    path('assignment/<int:assignment_id>/submissions/', views.view_submissions, name='view_submissions'),
    #path('submissions/<int:assignment_id>/', views.view_submissions, name='view_submissions'),
]
#if settings.DEBUG:
 #   urlpatterns += static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)