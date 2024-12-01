from django.urls import path
from .views import SuperUserLoginView
from . import views

app_name = 'customAdmin'

urlpatterns = [
    path('', SuperUserLoginView.as_view(), name='superuser_login'),
    path('student/', views.studentsDetail, name='studentsDetail'),
    path('teacher/', views.teachersDetail, name='teachersDetail'),
    path('course/', views.coursesDetail, name='coursesDetail'),
    path('prerequisite/', views.prerequisitesDetail, name='prerequisitesDetail'),
    path('section/', views.sectionsDetail, name='sectionsDetail'),
    path('feedback/', views.feedbackDetail, name='feedbackDetail'),
    path('books/', views.booksDetail, name='booksDetail'),
    path('issued_books/', views.issuedBooksDetail, name='issuedBooksDetail'),
]

