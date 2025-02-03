class  Subject {

    //Include the instance variables - title (String) and credits (double) and define the class constructor.
    String title;
    double credits;

    Subject(String title, double credits) {
    // Include the instance variables -
    //  title(a string) and credits(double) and
    //  define the class constructor
    this.title=title;
    this.credits=credits;
    }
    // Define toString() method, return String representation of the Subject object.
    public String toString() {
    // Define toString() method,
    // return string representation of the Subject object
        return this.title+" has "+this.credits+" credits";
    }
}