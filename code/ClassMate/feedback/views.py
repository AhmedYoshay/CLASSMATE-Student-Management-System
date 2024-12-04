from django.shortcuts import render, redirect
from django.contrib import messages
from .forms import FeedbackForm
from django.db import IntegrityError

def submit_feedback(request):
    student = request.user.student  

    if request.method == 'POST':
        form = FeedbackForm(request.POST, student=student)
        if form.is_valid():
            feedback = form.save(commit=False)
            feedback.student = student  

            try:
                feedback.save()
                messages.success(request, 'Feedback submitted successfully!')
                return redirect('feedback:submit_feedback') 
            except IntegrityError:
                messages.error(request, 'You have already submitted this feedback for this section.')
        else:
            messages.error(request, 'There was an error with your feedback submission.')
    else:
        form = FeedbackForm(student=student)

    return render(request, 'feedback/feedback.html', {'form': form})
