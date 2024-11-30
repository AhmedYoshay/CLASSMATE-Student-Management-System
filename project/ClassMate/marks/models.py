from django.db import models
from django.core.exceptions import ValidationError
from user.models import Student
from course.models import Course
from section.models import Section

class Heading(models.Model):
    name = models.CharField(max_length=100)  # Quiz, Assignment wagira
    section = models.ForeignKey(Section, on_delete=models.CASCADE)  

    def __str__(self):
        return f"{self.name} - {self.section.name}"

class Subcategory(models.Model):
    name = models.CharField(max_length=100)  
    heading = models.ForeignKey(Heading, on_delete=models.CASCADE, related_name="subcategories")
    total_marks = models.PositiveIntegerField()  
    weightage = models.DecimalField(max_digits=5, decimal_places=2)

    def __str__(self):
        return f"{self.name} ({self.heading.name})"

class MarksEntry(models.Model):
    student = models.ForeignKey(Student, on_delete=models.CASCADE)
    subcategory = models.ForeignKey(Subcategory, on_delete=models.CASCADE, related_name="marks_entries")
    marks = models.DecimalField(max_digits=5, decimal_places=2, null=True)
    
    def clean(self):
        if self.marks is not None and self.marks > self.subcategory.total_marks:
            raise ValidationError("Marks cannot exceed the total marks of the subcategory.")

    def save(self, *args, **kwargs):
        self.clean()
        super().save(*args, **kwargs)

    def __str__(self):
        return f"{self.student.user.username} - {self.subcategory.name}: {self.marks}"

class Grade(models.Model):
    student = models.ForeignKey(Student, on_delete=models.CASCADE)
    course = models.ForeignKey(Course, on_delete=models.CASCADE)
    gpa = models.DecimalField(max_digits=4, decimal_places=2, null=True, blank=True)  
    comments = models.TextField(null=True, blank=True) 

    class Meta:
        unique_together = ('student', 'course')
        verbose_name = "Grade"
        verbose_name_plural = "Grades"

    def __str__(self):
        return f"{self.student.user.username} - {self.course.name} - GPA: {self.gpa}"