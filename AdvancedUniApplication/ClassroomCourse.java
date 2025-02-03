public class ClassroomCourse extends Course {
    // Include additional instance variables - school (a String) and session (also a String)
    String school;
    String session;
    // Define the constructor, and call the superclass constructor from inside the class.
    public ClassroomCourse(Subject subject,String instructor,int fee,String school,String session){
        super(subject, instructor, fee);
        this.school=school;
        this.session=session;
    }
}
