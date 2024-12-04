from django import forms
from .models import Feedback
from section.models import Section,Enrollment

class FeedbackForm(forms.ModelForm):
    class Meta:
        model = Feedback
        fields = ['section', 'feedback_text']

    section = forms.ModelChoiceField(queryset=Section.objects.none())

    def __init__(self, *args, **kwargs):
        student = kwargs.pop('student') 
        super().__init__(*args, **kwargs)

        enrolled_sections = Section.objects.filter(
            enrollment__student=student,
            enrollment__status__in=['Enrolled', 'Completed']
        ).distinct()
        self.fields['section'].queryset = enrolled_sections
