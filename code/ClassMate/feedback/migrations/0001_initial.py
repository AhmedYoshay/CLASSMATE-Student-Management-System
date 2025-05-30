# Generated by Django 5.1 on 2024-12-01 21:28

import django.db.models.deletion
import django.utils.timezone
from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        ('section', '0004_section_finalized'),
        ('user', '0003_remove_customuser_name'),
    ]

    operations = [
        migrations.CreateModel(
            name='Feedback',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('feedback_text', models.TextField()),
                ('submission_date', models.DateTimeField(default=django.utils.timezone.now)),
                ('section', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='section.section')),
                ('student', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='user.student')),
            ],
        ),
    ]
