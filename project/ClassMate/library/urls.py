from django.urls import path
from .views import library_books

urlpatterns = [
    path('', library_books, name='library-books'),
]
