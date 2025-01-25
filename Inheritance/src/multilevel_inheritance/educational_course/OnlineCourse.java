package multilevel_inheritance.educational_course;

//class that extend course and serve as super class for another class
public class OnlineCourse extends Course{
    //Attribute
    private String platform;
    private String isRecorded;

    //constructor to initialize online course
    public OnlineCourse(String courseName, int duration, String platform , String isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    //method to display online course details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Plateform - " + platform +
                "Is recorder - " + isRecorded);
    }
}
