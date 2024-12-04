# ClassMate: Your Digital Classroom Companion 🎓

ClassMate is a comprehensive web application designed to manage and enhance the classroom experience. With features like attendance tracking, marks management, and more, ClassMate streamlines classroom operations for students, teachers, and administrators.

---


## Features ✨

- **User Authentication**: Secure login/logout system with role-based access (teacher, student, admin). Admin has the ability to create, update, and delete user accounts.

- **Attendance Management**: Mark attendance with statuses (Present, Absent, Late) and view attendance reports. Admin can view and export attendance data across all sections.

- **Marks Management**: Flexible and dynamic grading system, supporting multiple categories like quizzes, assignments, and exams with weightages. Admin has access to view and manage grades across all courses and sections.

- **Course Registration and Withdrawal**: Students can register for or withdraw from courses while meeting prerequisites. Admin can manage course offerings, update course details, and manage student enrollments.

- **Sections Management**: Handle multiple sections for the same course, allowing for different instructors or schedules. Admin has control over creating and assigning sections, and managing student enrollment across sections.

- **Library Books Management**: Track library books, including borrowing and returning details. Admin can add/remove books, manage library inventory, and track borrowing records.

- **Transcripts**: Generate and view academic transcripts. Admin can access all student transcripts and generate reports for specific students or cohorts.

- **Feedback System**: Allow students to provide feedback on courses, instructors, and more. Admin can review feedback for all courses and take necessary actions based on insights.

- **Profile Viewing**: Students and teachers can view and manage their profiles. Admin can view and edit user profiles as needed, and manage permissions.

- **Grade Analysis**: Analyze grades with tools like bell curve analysis, highlighting individual and overall performance. Admin can view detailed grade reports and analytics for all sections.

### **Admin Features**:
- **User Management**: Admin can create, update, and delete user accounts for students, teachers, and other admins.
- **Course Management**: Admin can create and manage courses, assign teachers, configure course settings (e.g., prerequisites), and monitor course enrollment.
- **Section Management**: Admin can manage section creation, assign teachers to sections, and oversee student enrollment in various sections.
- **Attendance Monitoring**: Admin can access and export attendance reports for all students and sections.
- **Marks Management**: Admin can view and edit marks for all students and sections, ensuring data accuracy.
- **Library Management**: Admin has full control over the library’s catalog, including adding new books, managing borrowings, and tracking overdue books.
- **Feedback Management**: Admin can view and manage all feedback submitted by students, ensuring that constructive feedback is used to improve courses and teaching.
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
   cd ClassMate/code/ClassMate
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

4. **Create and Configure `.env` File**:
   - Create a file named `.env` in the project root directory.
   - Add the following variables in the `.env` file, replacing the placeholders with your actual values:

   ```env
   # Security Settings
   SECRET_KEY=your-secret-key
   DEBUG=True  # Set to False in production
   ALLOWED_HOSTS=localhost,127.0.0.1

   # Database Configuration
   DATABASE_URL=postgresql://<user>:<password>@<host>:<port>/<database>

   # ReCAPTCHA Keys 
   RECAPTCHA_PUBLIC_KEY=
   RECAPTCHA_PRIVATE_KEY=

   # Email Settings
   EMAIL_HOST=smtp.your-email-provider.com
   EMAIL_PORT=587
   EMAIL_HOST_USER=your-email@example.com
   EMAIL_HOST_PASSWORD=your-email-password
   EMAIL_USE_TLS=True

   ```

   Notes:
   Replace `<user>`, `<password>`, `<host>`, `<port>`, and `<database>` in the `DATABASE_URL` with your actual database connection details.
   The `DATABASE_URL` format is `postgresql://<user>:<password>@<host>:<port>/<database>`.
   Ensure the `.env` file is added to `.gitignore` to prevent sensitive data from being tracked in version control.


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
