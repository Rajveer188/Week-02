package multilevel_inheritance.educational_course;

public class EducationalCourse {
    public static void main(String[] args) {
        //create object of course, online course and paid course
        Course course = new Course("core java programming", 10);
        Course onlineCourse = new OnlineCourse("java full stack", 15, "YouTube", "Yes");
        Course paidCourse = new PaidOnlineCourse("DBMS", 6, "Udemy", "Yes", 2000,10);

        //print courses details
        System.out.println("\nNormal course - ");
        course.displayDetails();
        System.out.println("\nOnline course - ");
        onlineCourse.displayDetails();
        System.out.println("\nPaid course - ");
        paidCourse.displayDetails();
    }
}
