from django.db import models
from user.models import Teacher,Student
from course.models import Course

class Section(models.Model):
    section_label = models.CharField(max_length=5)  #  like "A", "B", "C"
    course = models.ForeignKey(Course, on_delete=models.CASCADE)  
    teacher = models.ForeignKey(Teacher, on_delete=models.CASCADE) 
    capacity = models.PositiveIntegerField()  
    finalized = models.BooleanField(default=False)
    class Meta:
        unique_together = ('course', 'section_label')  
        verbose_name = "Section"  
        verbose_name_plural = "Sections"

    def __str__(self):
        return f"{self.course.course_name} - Section {self.section_label}" 

class Enrollment(models.Model):
    student = models.ForeignKey(Student, on_delete=models.CASCADE)
    section = models.ForeignKey(Section, on_delete=models.CASCADE)
    enrollment_date = models.DateField(auto_now_add=True) 
    STATUS_CHOICES = [
        ('Enrolled', 'Enrolled'),
        ('Dropped', 'Dropped'),
        ('Completed', 'Completed'), 
    ]
    status = models.CharField(max_length=20, choices=STATUS_CHOICES, default='Enrolled')
    
    def __str__(self):
        return f"{self.student.user.username} - {self.section.course.course_name} - Section {self.section.section_label}"