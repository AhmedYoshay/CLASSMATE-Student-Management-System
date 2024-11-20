from django.shortcuts import render, redirect
from django.contrib.auth.hashers import make_password
from user.models import CustomUser,Student,Teacher
from django.contrib.auth.decorators import login_required

@login_required
def index1(request):
    users = CustomUser.objects.all()  
    students = Student.objects.select_related('user').all()  
    
    return render(request, 'temp/index1.html', {'users': users, 'students': students})

def insert_user(request):
    if request.method == "POST":
        # Get data from the form
        username = request.POST['username']
        email = request.POST['email']
        password = request.POST['password']
        program = request.POST['program']
        status = request.POST['status']
        salary = request.POST['salary']
        
        # Create a new User
        user = CustomUser(username=username, email=email, password=make_password(password))
        user.save()
        
        # Create a corresponding Student record
        # student = Student(user=user, program=program, status=status)
        # student.save()
        teach = Teacher(user=user, program=program, status=status, salary=int(salary))  # Ensure salary is an integer
        teach.save()
        
        # Redirect to a success page or user listing page
        return redirect('index1')  # Make sure to create a view for 'user_list'
    
    return render(request, 'temp/insert_user.html')