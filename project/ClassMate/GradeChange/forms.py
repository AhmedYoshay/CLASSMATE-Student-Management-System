from django import forms
from .models import GradeChangeRequest
from section.models import Section,Enrollment

class GradeChangeForm(forms.ModelForm):
    class Meta:
        model = GradeChangeRequest
        fields = ['section', 'request_text']

    section = forms.ModelChoiceField(queryset=Section.objects.none())

    def __init__(self, *args, **kwargs):
        student = kwargs.pop('student') 
        super().__init__(*args, **kwargs)

        enrolled_sections = Section.objects.filter(
            enrollment__student=student,
            enrollment__status='Completed'
        ).distinct()
        self.fields['section'].queryset = enrolled_sections
