//import scanner class
import java.util.Scanner;

class Student {
    // Instance variables
    private String name;
    private String grade;
    //final variable
    private final String rollNumber;
    // static variable
    static String universityName;
    static int totalStudents = 0;


    // Constructor to initialize variables
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        //Increment students count
        totalStudents++;
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("\nTotal Students - " + totalStudents);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\nUniversity- " + universityName +
                "\nName- " + name +
                "\nRoll Number- " + rollNumber +
                "\nGrade- " + grade);
    }
}

class UniversityManagment {
    public static void main(String[] args) {
        // Set the university name
        Student.universityName = "RGPV University";

        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //get input
        System.out.println("Student 1-");
        System.out.println("Enter name - ");
        String name1 = input.nextLine();
        System.out.println("Enter roll number - ");
        String rollNumber1 = input.nextLine();
        System.out.println("Enter Grade - ");
        String grade1 = input.nextLine();

        System.out.println("Student 2-");
        System.out.println("Enter name - ");
        String name2 = input.nextLine();
        System.out.println("Enter roll number - ");
        String rollNumber2 = input.nextLine();
        System.out.println("Enter Grade - ");
        String grade2 = input.nextLine();

        // Create student objects
        Student student1 = new Student(name1, rollNumber1, grade1);
        Student student2 = new Student(name2, rollNumber2, grade2);

        //display total number of students
        Student.displayTotalStudents();

        //display student details if they are instances of the Student class
        if (student1 instanceof Student) {
            student1.displayDetails();
        }

        if (student2 instanceof Student) {
            student2.displayDetails();
        }
        //close scanner
        input.close();
    }
}
