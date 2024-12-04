from django.shortcuts import render, redirect, get_object_or_404
from .models import Book, BookIssue
from ClassMate.decorators import student_required
from django.utils import timezone
from django.contrib import messages
from django.db import connection

def execute_raw_query_all(query, params=None):
    with connection.cursor() as cursor:
        cursor.execute(query, params or [])
        columns = [col[0] for col in cursor.description]
        return [dict(zip(columns, row)) for row in cursor.fetchall()]
    
def execute_raw_insert(query, params):
    with connection.cursor() as cursor:
        cursor.execute(query, params)
        

def execute_raw_query_single(query, params=None):
    with connection.cursor() as cursor:
        cursor.execute(query, params or [])
        return cursor.fetchone()

def is_book_already_issued(student_id, book_id):
    query = '''
        SELECT 1
        FROM library_bookissue
        WHERE student_id = %s AND book_id = %s AND is_returned = FALSE
        LIMIT 1
    '''
    result = execute_raw_query_single(query, [student_id, book_id])
    return result is not None

        
@student_required
def library_books(request):
    student = request.user.student 
    issued_books = BookIssue.objects.filter(student=student, is_returned=False).select_related('book')
    # books = Book.objects.all()

    student = request.user.student
    
    # issued_books_query = '''
    #     SELECT bi.*, b.title, b.author 
    #     FROM library_bookissue AS bi
    #     INNER JOIN library_book AS b ON bi.book_id = b.id
    #     WHERE bi.student_id = %s AND bi.is_returned = FALSE
    # '''
    # issued_books = execute_raw_query_all(issued_books_query, [student.id])
    books_query = '''
        SELECT * FROM library_book
    '''
    books = execute_raw_query_all(books_query)
    
    if request.method == 'POST':
        book_id = request.POST.get('book_id')
        if book_id:
            book = get_object_or_404(Book, id=book_id)
            # already_issued = issued_books.filter(book=book).exists() 
            already_issued = is_book_already_issued(student.id, book_id)

            if not already_issued:
                if  book.available_copies > 0:
                    book.available_copies -= 1
                    book.save()

                    # BookIssue.objects.create(
                    #     book=book,
                    #     student=student,
                    #     issue_date=timezone.now(),
                    #     is_returned=False
                    # )
                    issue_date = timezone.now()
                    insert_query = '''
                        INSERT INTO library_bookissue (book_id, student_id, issue_date, is_returned)
                        VALUES (%s, %s, %s, %s)
                    '''
                    execute_raw_insert(insert_query, [book.id, student.id, issue_date, False])
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
