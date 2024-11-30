# ClassMate: Your Digital Classroom Companion 🎓

ClassMate is a comprehensive web application designed to manage and enhance the classroom experience. With features like attendance tracking, marks management, and more, ClassMate streamlines classroom operations for students, teachers, and administrators.

---

## Features ✨

- **User Authentication**: Secure login/logout system with role-based access (teacher, student, admin).
- **Attendance Management**: Mark attendance with statuses (Present, Absent, Late) and view attendance reports.
- **Marks Management**: Flexible and dynamic grading system, supporting multiple categories like quizzes, assignments, and exams with weightages.
- **Course Registration and Withdrawal**: Students can register for or withdraw from courses while meeting prerequisites.
- **Sections Management**: Handle multiple sections for the same course, allowing for different instructors or schedules.
- **Library Books Management**: Track library books, including borrowing and returning details.
- **Transcripts**: Generate and view academic transcripts.
- **Feedback System**: Allow students to provide feedback on courses, instructors, and more.
- **Profile Viewing**: Students and teachers can view and manage their profiles.
- **Grade Analysis**: Analyze grades with tools like bell curve analysis, highlighting individual and overall performance.

---

## Technologies Used 🛠️

- **Backend**: Django
- **Frontend**: HTML, CSS, JavaScript
- **Database**: PostgreSQL
- **Recaptcha**: Enhanced security with Google Recaptcha

---

## Installation and Setup 🚀

Follow these steps to set up the project locally:

### Prerequisites

1. Python 3.8+ installed on your machine.
2. PostgreSQL installed and running.
3. A virtual environment tool like `venv` or `virtualenv`.

### Steps

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Musaddiq123m/ClassMate.git
   cd ClassMate
   ```

2. **Set Up Virtual Environment**:
   ```bash
   python -m venv env
   source env/bin/activate  # For Linux/Mac
   env\Scripts\activate     # For Windows
   ```

3. **Install Dependencies**:
   ```bash
   pip install -r requirements.txt
   ```

4. **Configure the Database**:
   - Update the `DATABASES` setting in `settings.py` with your PostgreSQL credentials.

5. **Apply Migrations**:
   ```bash
   python manage.py makemigrations
   python manage.py migrate
   ```

6. **Create a Superuser**:
   ```bash
   python manage.py createsuperuser
   ```

7. **Run the Development Server**:
   ```bash
   python manage.py runserver
   ```

8. **Access the Application**:
   Open [http://127.0.0.1:8000](http://127.0.0.1:8000) in your browser.


---

## Contribution Guidelines 🤝

- Fork the repository and create a new branch for your feature.
- Make your changes and create a pull request with a detailed description.
- Follow best practices for Python and Django development.

---
