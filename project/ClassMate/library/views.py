from django.shortcuts import render
from .models import Book

def library_books(request):
    books = Book.objects.all()
    return render(request, 'library/books_list.html', {'books': books})
