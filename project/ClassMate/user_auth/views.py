from django.shortcuts import render, redirect
from django.contrib.auth import authenticate, login, logout
from django.contrib import messages
from django.http import HttpResponse
from .forms import LoginForm 

def login_view(request):
    if request.method == 'POST':
        form = LoginForm(request.POST)
        if form.is_valid():  # Check if form and reCAPTCHA are valid
            username = form.cleaned_data['username']
            password = form.cleaned_data['password']
            recaptcha_response = form.cleaned_data['captcha']  

            if not recaptcha_response:
                messages.error(request, 'Please verify that you are not a robot.')
            else:
                user = authenticate(request, username=username, password=password)
            
            if user is not None:
                login(request, user)
                return redirect('index1') 
                # return HttpResponse("User is logged in")
            else:
                messages.error(request, 'Invalid username or password')
        else:
            messages.error(request, 'Invalid reCAPTCHA')
    else:
        form = LoginForm() 

    return render(request, 'user_auth/login.html', {'form': form}) 

def logout_view(request):
    logout(request)
    return redirect('login') 