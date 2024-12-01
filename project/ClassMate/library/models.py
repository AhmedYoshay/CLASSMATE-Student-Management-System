from django.db import models
from user.models import Student
# Create your models here.
class Book(models.Model):
    title = models.CharField(max_length=100)
    author = models.CharField(max_length=100)
    isbn = models.CharField(max_length=20)
    available_copies = models.PositiveIntegerField(default=1)

    def __str__(self):
        return self.title
    
class BookIssue(models.Model):
    student = models.ForeignKey(Student, on_delete=models.CASCADE, limit_choices_to={'is_staff': False})
    book = models.ForeignKey(Book, on_delete=models.CASCADE)
    issue_date = models.DateField(auto_now_add=True)
    return_date = models.DateField(null=True, blank=True)
    is_returned = models.BooleanField(default=False)

    def __str__(self):
        return f"{self.student.user.username} - {self.book.title}"