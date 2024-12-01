from django import forms
from user.models import CustomUser,Student
import random
import string
from django.db.models import Max
import datetime
from course.models import Course,Prerequisite
from django import forms
from course.models import Course
from user.models import Teacher
from library.models import Book
from section.models import Section

class AddSectionForm(forms.ModelForm):
    class Meta:
        model = Section
        fields = ['course', 'teacher', 'capacity']

    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)
        self.fields['course'].queryset = Course.objects.all().order_by('course_name')
        self.fields['teacher'].label_from_instance = lambda obj: f"{obj.user.first_name} {obj.user.last_name}"

class AddCourseForm(forms.ModelForm):
    class Meta:
        model = Course
        fields = ['course_code', 'course_name', 'description', 'credits', 'recommended_semester']

class AddPrerequisiteForm(forms.Form):
    course = forms.ModelChoiceField(
        queryset=Course.objects.all().order_by('course_name'),
        label="Course", 
        required=True
    )
    prerequisite = forms.ModelChoiceField(
        queryset=Course.objects.all().order_by('course_name'), 
        label="Prerequisite", 
        required=True
    )

    def clean(self):
        cleaned_data = super().clean()
        course = cleaned_data.get('course')
        prerequisite = cleaned_data.get('prerequisite')

        if course == prerequisite:
            raise forms.ValidationError("A course cannot be its own prerequisite.")

        if Prerequisite.objects.filter(course=course, prerequisite=prerequisite).exists():
            raise forms.ValidationError(f"{prerequisite.course_name} is already a prerequisite for {course.course_name}.")

        if Prerequisite.objects.filter(course=prerequisite, prerequisite=course).exists():
            raise forms.ValidationError(f"{course.course_name} is already a prerequisite for {prerequisite.course_name}.")

        return cleaned_data

class AddStudentForm(forms.ModelForm):
    program = forms.CharField(max_length=50)

    class Meta:
        model = CustomUser
        fields = ['first_name', 'last_name', 'email']

    def generate_username(self):
        current_year = datetime.datetime.now().year
        year_suffix = str(current_year)[2:]

        max_id = CustomUser.objects.aggregate(Max('id'))['id__max']
        next_id = max_id + 1 if max_id else 1  # If no users, start from 1
        username = f"{year_suffix}S-{str(next_id).zfill(4)}"
        return username

    def generate_password(self):
        return ''.join(random.choices(string.ascii_letters + string.digits, k=10))

class AddTeacherForm(forms.ModelForm):
    program = forms.CharField(max_length=50)
    salary = forms.IntegerField(min_value=0)

    class Meta:
        model = CustomUser
        fields = ['first_name', 'last_name', 'email']

    def generate_username(self):
        current_year = datetime.datetime.now().year
        year_suffix = str(current_year)[2:]

        max_id = CustomUser.objects.aggregate(Max('id'))['id__max']
        next_id = max_id + 1 if max_id else 1  # If no users, start from 1
        username = f"{year_suffix}T-{str(next_id).zfill(4)}"
        return username

    def generate_password(self):
        return ''.join(random.choices(string.ascii_letters + string.digits, k=10))


class AddBookForm(forms.ModelForm):
    class Meta:
        model = Book
        fields = ['title', 'author', 'isbn', 'available_copies']
