from django.contrib.auth.models import AbstractUser
from django.db import models

class CustomUser(AbstractUser):
    email = models.EmailField(unique=True)

class Student(models.Model):
    user = models.OneToOneField(CustomUser, on_delete=models.CASCADE)
    program = models.CharField(max_length=50)
    status = models.CharField(max_length=15, choices=[('active', 'Active'), ('graduated', 'Graduated'), ('frozen', 'Frozen')])

class Teacher(models.Model):
    user = models.OneToOneField(CustomUser, on_delete=models.CASCADE)
    program = models.CharField(max_length=50)
    status = models.CharField(max_length=15)
    salary = models.IntegerField()
