// Program to Simulate Student Report
import java.util.Scanner;

class Student {
    // Attribute
    String name, rollNumber;
    double marks;

    // Construcor to initialze object
    Student(String name, String rollString, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    // method to calculate grade
    char calculateGrade(double marks){
        if(marks >= 80){
            return 'A';
        }else if(marks >= 60){
            return 'B';
        }else if(marks >= 40){
            return 'C';
        }else{
            return 'F';
        }
    }
    // method to display student details and grade
    void displayDetails(char grade) {
        System.out.println("Student name - " + name +
                "\nroll no. - " + rollNumber +
                "\nmarks - " + marks +
                "\ngrade - " + grade);
    }
}

class StudentReport {
    //main method
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //get input
        System.out.println("Enter name - ");
        String name = input.nextLine();
        System.out.println("Enter roll number - ");
        String roll = input.nextLine();
        System.out.println("Enter marks - ");
        double marks = input.nextDouble();

        //create object of Student class
        Student student = new Student(name, roll, marks);

        //get grade 
        char grade = student.calculateGrade(marks);
        //display result
        student.displayDetails(grade);

        //close scanner object
        input.close();

    }
}