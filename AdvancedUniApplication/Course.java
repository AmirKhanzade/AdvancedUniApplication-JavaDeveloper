abstract class Course {
    // include instance variables for Course class and complete constructor code
    // Add the instance variables subject, instructor (String) and the course fee (int), assignmentMarks and quizMarks (int).
    //The variable subject is an object of the Subject class, define a Constructor for Course class.
    Subject subject;
    String instructor;
    int fee;
    int assignmentMarks;
    int quizMarks;

    Course(Subject subject, String instructor, int fee) {
        this.subject=subject;
        this.instructor=instructor;
        this.fee=fee;
    }

}