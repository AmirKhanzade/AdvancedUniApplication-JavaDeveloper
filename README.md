📚 Course Enrollment & Grading System (Java, OOP)
Overview

A console-based Course Enrollment & Grading System demonstrating core Object-Oriented Programming concepts in Java.
A learner enrolls in either a ClassroomCourse or OnlineCourse, enters assessment marks, and receives a computed grade score and pass/complete message.

The design showcases abstraction, inheritance, encapsulation, interfaces, and polymorphism using a small, easy-to-follow domain model.

Key Concepts & Design

Abstraction / Inheritance

Course (abstract) → specialized by ClassroomCourse and OnlineCourse

Subject is a value object held by Course

Interfaces

Assessment defines assignmentScore(int) and quizScore(int)

Learner implements Assessment to record marks for the enrolled course

Encapsulation

Domain data is kept within classes (e.g., Course holds marks; Learner holds grade)

Polymorphism

Grading logic distinguishes Online vs Classroom through course/subject information

Entities

Subject

title (e.g., Java, Java Online, JavaScript Online)

credits (e.g., 4, 6)

Course (abstract)

subject, instructor, fee

assignmentMarks, quizMarks

ClassroomCourse (extends Course)

Adds school, session

OnlineCourse (extends Course)

Adds videoLessons, weeks (intended to describe course structure)

Assessment (interface)

assignmentScore(int), quizScore(int)

Learner (implements Assessment)

name, course, gradeScore

calculateGrade() normalizes scores to a 10-point scale and averages assignment + quiz

Grading Rules

ClassroomCourse: max 100 (assignments), 30 (quiz)

OnlineCourse: max 30 (assignments), 10 (quiz)

Final gradeScore is the mean of:

assignmentGrade = (assignmentMarks / maxAssignment) * 10

quizGrade = (quizMarks / maxQuiz) * 10

What You Can Do

Choose a course (Java / Java Online / JavaScript / JavaScript Online)

Enter assignment and quiz marks according to the course type

See normalized gradeScore on a 10-point scale

Receive a pass/complete message based on the result
