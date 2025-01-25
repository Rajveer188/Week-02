package multilevel_inheritance.educational_course;

//super most class course
public class Course {
    //Attribute
    private String courseName;
    private int duration;

    //constructor to initialize course details
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    //method to display course details
    public void displayDetails(){
        System.out.println("Course Name - "+ courseName +
                "\nCourse duration - " + duration + "Months");
    }
}
