-- Database: ClassMate_db_schema_postgre

-- DROP DATABASE IF EXISTS "ClassMate_db_schema_postgre";

CREATE DATABASE "ClassMate_db_schema_postgre"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;


CREATE TABLE "User" (
    "user_id" SERIAL PRIMARY KEY,
    "username" VARCHAR(50),
    "password" VARCHAR(50),
    "email" VARCHAR(100)
);

CREATE TABLE "Student" (
    "student_id" SERIAL PRIMARY KEY,
    "program" VARCHAR(50),
    "status" VARCHAR(15) CHECK ("status" IN ('active', 'graduated', 'frozen')),
    FOREIGN KEY ("student_id") REFERENCES "User"("user_id")
);

CREATE TABLE "Teacher" (
    "teacher_id" SERIAL PRIMARY KEY,
    "program" VARCHAR(50),
    "status" VARCHAR(15),
    "salary" INT CHECK ("salary" >= 37000),
    FOREIGN KEY ("teacher_id") REFERENCES "User"("user_id")
);

CREATE TABLE "Course" (
    "course_id" SERIAL PRIMARY KEY,
    "course_name" VARCHAR(100),
    "description" VARCHAR(255)
);

CREATE TABLE "Section" (
    "YearSection" VARCHAR(15) PRIMARY KEY,
    "course_id" INT,
    "teacher_id" INT,
    "classroom" VARCHAR(50),
    "capacity" INT CHECK ("capacity" <= 60),
    FOREIGN KEY ("course_id") REFERENCES "Course"("course_id"),
    FOREIGN KEY ("teacher_id") REFERENCES "Teacher"("teacher_id")
);

CREATE TABLE "File" (
    "file_id" SERIAL PRIMARY KEY,
    "file_name" VARCHAR(100),
    "file_path" VARCHAR(255)
);

CREATE TABLE "Post" (
    "post_id" SERIAL PRIMARY KEY,
    "section_id" VARCHAR(15),
    "user_id" INT,
    "description" VARCHAR(500),
    "post_file" INT,
    "creation_date" TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY ("section_id") REFERENCES "Section"("YearSection"),
    FOREIGN KEY ("user_id") REFERENCES "User"("user_id"),
    FOREIGN KEY ("post_file") REFERENCES "File"("file_id")
);

CREATE TABLE "Comment" (
    "comment_id" SERIAL PRIMARY KEY,
    "user_id" INT,
    "post_id" INT,
    "description" VARCHAR(500),
    FOREIGN KEY ("post_id") REFERENCES "Post"("post_id"),
    FOREIGN KEY ("user_id") REFERENCES "User"("user_id")
);

CREATE TABLE "Feedback" (
    "feedback_id" SERIAL PRIMARY KEY,
    "student_id" INT,
    "section_id" VARCHAR(15),
    "description" VARCHAR(500),
    "creation_time" TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id"),
    FOREIGN KEY ("section_id") REFERENCES "Section"("YearSection")
);

CREATE TABLE "Assignment" (
    "assignment_id" SERIAL PRIMARY KEY,
    "post_id" INT,
    "due_date" DATE,
    "total_marks" FLOAT,
    FOREIGN KEY ("post_id") REFERENCES "Post"("post_id")
);

CREATE TABLE "Submission" (
    "submission_id" SERIAL PRIMARY KEY,
    "assignment_id" INT,
    "student_id" INT,
    "file_id" INT,
    "submission_time" TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    "obtained_marks" FLOAT,
    FOREIGN KEY ("assignment_id") REFERENCES "Assignment"("assignment_id"),
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id"),
    FOREIGN KEY ("file_id") REFERENCES "File"("file_id")
);

CREATE TABLE "Grade" (
    "grade_id" SERIAL PRIMARY KEY,
    "student_id" INT,
    "section_id" VARCHAR(15),
    "grade" VARCHAR(5),
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id"),
    FOREIGN KEY ("section_id") REFERENCES "Section"("YearSection")
);

CREATE TABLE "Enrollment" (
    "enrollment_id" SERIAL PRIMARY KEY,
    "student_id" INT,
    "section_id" VARCHAR(15),
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id"),
    FOREIGN KEY ("section_id") REFERENCES "Section"("YearSection")
);

CREATE TABLE "Marks" (
    "marks_id" SERIAL PRIMARY KEY,
    "student_id" INT,
    "section_id" VARCHAR(15),
    "name" VARCHAR(50),
    "weightage" FLOAT,
    "total_marks" FLOAT,
    "obtained_marks" FLOAT,
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id"),
    FOREIGN KEY ("section_id") REFERENCES "Section"("YearSection"),
    CHECK ("obtained_marks" <= "total_marks")
);

CREATE TABLE "Book" (
    "book_id" SERIAL PRIMARY KEY,
    "title" VARCHAR(100),
    "author" VARCHAR(100),
    "isbn" VARCHAR(20)
);

CREATE TABLE "Book_issue" (
    "issue_id" SERIAL PRIMARY KEY,
    "book_id" INT,
    "student_id" INT,
    "issue_date" DATE,
    "return_date" DATE,
    FOREIGN KEY ("book_id") REFERENCES "Book"("book_id"),
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id")
);

CREATE TABLE "Payment" (
    "payment_id" SERIAL PRIMARY KEY,
    "student_id" INT,
    "amount" FLOAT,
    "payment_date" DATE,
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id")
);

