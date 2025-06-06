# Generated by Django 5.1 on 2024-11-22 17:58

import django.db.models.deletion
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('section', '0001_initial'),
        ('user', '0003_remove_customuser_name'),
    ]

    operations = [
        migrations.CreateModel(
            name='Enrollment',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('enrollment_date', models.DateField(auto_now_add=True)),
                ('status', models.CharField(choices=[('Enrolled', 'Enrolled'), ('Dropped', 'Dropped')], default='Enrolled', max_length=20)),
                ('section', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='section.section')),
                ('student', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='user.student')),
            ],
        ),
    ]
