from django.db import models
from user.models import Student, Teacher
from section.models import Section  

class Attendance(models.Model):
    student = models.ForeignKey(Student, on_delete=models.CASCADE)  
    section = models.ForeignKey(Section, on_delete=models.CASCADE)  
    date = models.DateField()  
    status = models.CharField(
        max_length=1,
        choices=[('P', 'Present'), ('A', 'Absent'), ('L', 'Late')]  
    )

    class Meta:
        unique_together = ('student', 'section', 'date') 
        verbose_name = 'Attendance'
        verbose_name_plural = 'Attendance'

    def __str__(self):
        return f"{self.student} - {self.date} - {self.status}"
