
//import scanner class
import java.util.Scanner;

class Course {
    // instance variable
    private String courseName;
    private int duration;
    private double fee;
    // class variable
    private static String instituteName = "Technocrats Institute of Technology";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name- " + courseName +
                "\nDuration- " + duration + " month" +
                "\nFee- " + fee +
                "\nInstitute Name- " + instituteName);
    }

    // method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

// Main class with the main method
public class CourseManagement {
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // get input for product details
        System.out.println("Enter name of 1st course");
        String firstCourse = input.nextLine();

        System.out.println("Enter duration of 1st course");
        int firstCourseDuration = input.nextInt();

        System.out.println("Enter fee of 1st course");
        double firstCourseFee = input.nextDouble();
        input.nextLine();

        System.out.println("Enter name of 2nd course");
        String secondCourse = input.next();

        System.out.println("Enter duration of 2nd course");
        int secondCourseDuration = input.nextInt();

        System.out.println("Enter fee of 2nd course");
        double secondCourseFee = input.nextDouble();
        input.nextLine();

        // Create course objects
        Course course1 = new Course(firstCourse, firstCourseDuration, firstCourseFee);
        Course course2 = new Course(secondCourse, secondCourseDuration, secondCourseFee);

        // Display details of courses before updating institute
        System.out.println("Before Updating Institute Name-");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        // get institute name
        System.out.println("enter name of institute - ");
        String newInstitute = input.nextLine();
        // Update the institute name
        Course.updateInstituteName(newInstitute);

        // Display details of courses after updating the institute
        System.out.println("\nAfter Updating Institute Name-");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        // close scanner
        input.close();
    }
}