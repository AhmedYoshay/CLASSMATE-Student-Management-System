from django.shortcuts import render, redirect, get_object_or_404
from .models import Book, BookIssue
from ClassMate.decorators import student_required
from django.utils import timezone
from django.contrib import messages


@student_required
def library_books(request):
    student = request.user.student 
    issued_books = BookIssue.objects.filter(student=student, is_returned=False).select_related('book')
    books = Book.objects.all()

    if request.method == 'POST':
        book_id = request.POST.get('book_id')
        if book_id:
            book = get_object_or_404(Book, id=book_id)
            already_issued = issued_books.filter(book=book).exists() 

            if not already_issued:
                if  book.available_copies > 0:
                    book.available_copies -= 1
                    book.save()

                    BookIssue.objects.create(
                        book=book,
                        student=student,
                        issue_date=timezone.now(),
                        is_returned=False
                    )
                    messages.success(request, 'Book issued successfully!')
                    return redirect('library_books')  
                else:
                     messages.error(request, "Sorry. No copies available")
            else:
                messages.error(request, "You have already issued this book")

    return render(request, 'library/books_list.html', {
        'issued_books': issued_books,
        'books': books
    })
