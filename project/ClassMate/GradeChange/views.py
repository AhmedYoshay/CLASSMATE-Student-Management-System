from django.shortcuts import render, redirect, get_object_or_404
from django.contrib import messages
from .forms import GradeChangeForm
from django.db import IntegrityError
from .models import GradeChangeRequest
from ClassMate.decorators import student_required,teacher_required

@student_required
def GradeChangeRequestView(request):
    student = request.user.student  

    if request.method == 'POST':
        form = GradeChangeForm(request.POST, student=student)
        if form.is_valid():
            gradechange = form.save(commit=False)
            gradechange.student = student  

            try:
                gradechange.save()
                messages.success(request, 'Grade Change Request submitted successfully!')
                return redirect('GradeChange:GradeChangeRequest') 
            except IntegrityError:
                messages.error(request, 'You have already submitted this request for this section.')
        else:
            messages.error(request, 'There was an error with your request submission.')
    else:
        form = GradeChangeForm(student=student)

    return render(request, 'GradeChange/GradeChange.html', {'form': form})

@teacher_required
def GradeChangeDetail(request):
    GradeChanges = GradeChangeRequest.objects.select_related('student', 'section').all()

    if request.method == 'POST':
        GradeChange_id = request.POST.get('GradeChange_id')
        GradeChange = get_object_or_404(GradeChangeRequest, pk=GradeChange_id)
        
        if 'star' in request.POST:
            GradeChange.starred = not GradeChange.starred
            GradeChange.save()
            messages.success(request, 'GradeChange updated successfully!')
        elif 'disregard' in request.POST:
            GradeChange.delete()
            messages.success(request, 'GradeChange disregarded successfully!')

        return redirect('GradeChange:GradeChangeDetail')

    return render(request, 'GradeChange/GradeChangeTeacher.html', {
        'GradeChanges': GradeChanges,
    })