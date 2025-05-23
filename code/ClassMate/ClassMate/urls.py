"""
URL configuration for ClassMate project.

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/5.1/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import include, path
from django.conf import settings
from django.conf.urls.static import static

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', include('user_auth.urls')),
    path('library/', include('library.urls')),  
    path('temp/', include('temp.urls')),  
    path('captcha/', include('captcha.urls')),
    path('course/', include('course.urls')),
    path('section/', include('section.urls')),
    path('attendance/', include('attendance.urls')),
    path('marks/', include('marks.urls')),
    path('profile/', include('user.urls')),
    path('customAdmin/', include('customAdmin.urls')),
    path('feedback/', include('feedback.urls')),
    path('GradeChange/', include('GradeChange.urls')),
    path('classroom/', include(('classroom.urls','classroom'), namespace='classroom')),
]+ static(settings.STATIC_URL, document_root=settings.STATICFILES_DIRS[0])
if settings.DEBUG:
    urlpatterns += static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)