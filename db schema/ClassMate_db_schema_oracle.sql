CREATE TABLE "User" (
    "user_id" int PRIMARY KEY,
    "username" varchar(50),
    "password" varchar(50),
    "email" varchar(100)
);

CREATE TABLE "Student" (
    "student_id" int PRIMARY KEY,
    "program" varchar(50),
    "status" varchar(15) CHECK ("status" IN ('active', 'graduated', 'frozen')),
    FOREIGN KEY ("student_id") REFERENCES "User"("user_id")
);

CREATE TABLE "Teacher" (
    "teacher_id" int PRIMARY KEY,
    "program" varchar(50),
    "status" varchar(15),
    "salary" int CHECK ("salary" >= 37000),
    FOREIGN KEY ("teacher_id") REFERENCES "User"("user_id")
);

CREATE TABLE "Course" (
    "course_id" int PRIMARY KEY,
    "course_name" varchar(100),
    "description" varchar(255)
);

CREATE TABLE "Section" (
    "YearSection" varchar(15) PRIMARY KEY,
    "course_id" int,
    "teacher_id" int,
    "capacity" int CHECK ("capacity" <= 60),
    FOREIGN KEY ("course_id") REFERENCES "Course"("course_id"),
    FOREIGN KEY ("teacher_id") REFERENCES "Teacher"("teacher_id")
);

CREATE TABLE "File" (
    "file_id" int PRIMARY KEY,
    "file_name" varchar(100),
    "file_path" varchar(255)
);

CREATE TABLE "Post" (
    "post_id" int PRIMARY KEY,
    "section_id" varchar(15),
    "user_id" int,
    "description" varchar(500),
    "post_file" int,
    "creation_date" timestamp DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY ("section_id") REFERENCES "Section"("YearSection"),
    FOREIGN KEY ("user_id") REFERENCES "User"("user_id"),
    FOREIGN KEY ("post_file") REFERENCES "File"("file_id")
);

CREATE TABLE "Comment" (
    "comment_id" int PRIMARY KEY,
    "user_id" int,
    "post_id" int,
    "description" varchar(500),
    FOREIGN KEY ("post_id") REFERENCES "Post"("post_id"),
    FOREIGN KEY ("user_id") REFERENCES "User"("user_id")
);

CREATE TABLE "Feedback" (
    "feedback_id" int PRIMARY KEY,
    "student_id" int,
    "section_id" varchar(15),
    "description" varchar(500),
    "creation_time" timestamp DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id"),
    FOREIGN KEY ("section_id") REFERENCES "Section"("YearSection")
);

CREATE TABLE "Assignment" (
    "assignment_id" int PRIMARY KEY,
    "post_id" int,
    "due_date" date,
    "total_marks" float,
    FOREIGN KEY ("post_id") REFERENCES "Post"("post_id")
);

CREATE TABLE "Submission" (
    "submission_id" int PRIMARY KEY,
    "assignment_id" int,
    "student_id" int,
    "file_id" int,
    "submission_time" timestamp DEFAULT CURRENT_TIMESTAMP,
    "obtained_marks" float,
    FOREIGN KEY ("assignment_id") REFERENCES "Assignment"("assignment_id"),
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id"),
    FOREIGN KEY ("file_id") REFERENCES "File"("file_id")
);

CREATE TABLE "Grade" (
    "grade_id" int PRIMARY KEY,
    "student_id" int,
    "section_id" varchar(15),
    "grade" varchar(5),
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id"),
    FOREIGN KEY ("section_id") REFERENCES "Section"("YearSection")
);

CREATE TABLE "Enrollment" (
    "enrollment_id" int PRIMARY KEY,
    "student_id" int,
    "section_id" varchar(15),
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id"),
    FOREIGN KEY ("section_id") REFERENCES "Section"("YearSection")
);

CREATE TABLE "Marks" (
    "marks_id" int PRIMARY KEY,
    "student_id" int,
    "section_id" varchar(15),
    "name" varchar(50),
    "weightage" float,
    "total_marks" float,
    "obtained_marks" float,
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id"),
    FOREIGN KEY ("section_id") REFERENCES "Section"("YearSection"),
    CHECK ("obtained_marks" <= "total_marks")
);

CREATE TABLE "Book" (
    "book_id" int PRIMARY KEY,
    "title" varchar(100),
    "author" varchar(100),
    "isbn" varchar(20)
);

CREATE TABLE "Book_issue" (
    "issue_id" int PRIMARY KEY,
    "book_id" int,
    "student_id" int,
    "issue_date" date,
    "return_date" date,
    FOREIGN KEY ("book_id") REFERENCES "Book"("book_id"),
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id")
);

CREATE TABLE "Payment" (
    "payment_id" int PRIMARY KEY,
    "student_id" int,
    "amount" float,
    "payment_date" date,
    FOREIGN KEY ("student_id") REFERENCES "Student"("student_id")
);
