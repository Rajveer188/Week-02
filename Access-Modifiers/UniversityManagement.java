//import scanner class
import java.util.Scanner;

class Student{
    //Attribute
    public int rollNumber;
    protected String name;
    private double CGPA;

    //constructer to initialze student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    //method to access cgpa
    public double getCGPA() {
        return CGPA;
    }
    //method to modify cppa
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    //method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number- " + rollNumber +
         "\nName- " + name +
         "\nCGPA- " + CGPA);
    }
}
// PostgraduateStudent class subclass
class PostgraduateStudent extends Student {
    //constructor to initalize object
    public PostgraduateStudent(int rollNumber, String name, double CGPA){
        // Call superclass constructor
        super(rollNumber, name, CGPA);
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        super.displayStudentDetails();
    }
}
// Main class
class UniversityManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get input for a Student
        System.out.println("Enter roll number of student-");
        int rollNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter name of student-");
        String name = input.nextLine();

        System.out.println("Enter CGPA of student-");
        double CGPA = input.nextDouble();

        // Create a Student object
        Student student = new Student(rollNumber, name, CGPA);

        //modify CGPA using a setter method
        System.out.println("\nEnter updated CGPA for student-");
        double updatedCGPA = input.nextDouble();
        student.setCGPA(updatedCGPA);

        // Display student details
        System.out.println("\nStudent Details:");
        student.displayStudentDetails();

        //create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(rollNumber, name, updatedCGPA);

        //display postgraduate student details
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();

        // Close scanner
        input.close();
    }
}