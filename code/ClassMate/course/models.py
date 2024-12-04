from django.db import models

class Course(models.Model):
    course_code = models.CharField(max_length=20, unique=True)
    course_name = models.CharField(max_length=100)
    description = models.TextField(null=True, blank=True)
    credits = models.IntegerField(null=True, blank=True)
    recommended_semester = models.IntegerField(null=True, blank=True)
    def __str__(self):
        return self.course_name

class Prerequisite(models.Model):
    course = models.ForeignKey(Course, related_name='main_course', on_delete=models.CASCADE)
    prerequisite = models.ForeignKey(Course, related_name='prerequisites', on_delete=models.CASCADE)

    def __str__(self):
        return f"{self.prerequisite.course_name} is a prerequisite for {self.course.course_name}"
