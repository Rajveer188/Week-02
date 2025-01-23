import java.util.ArrayList;
import java.util.List;

//class to represent student
class Student {
    private String name;
    private int studentId;
    private List<Subject> subjects;
    private GradeCalculator gradeCalculator;

    // constructor to initialize student
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = new ArrayList<>();
        this.gradeCalculator = new GradeCalculator();
    }

    // add Subject to the student
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // method to display student details and grades
    public void displayStudentDetails() {
        System.out.println("Student Name- " + name +
                "\nStudent ID- " + studentId);
        for (Subject subject : subjects) {
            char grade = gradeCalculator.calculateGrade(subject);
            System.out.println(
                    "Subject- " + subject.getSubjectName() + ", Marks- " + subject.getMarks() + ", Grade- " + grade);
        }
    }
}

// class to represent subject
class Subject {
    private String subjectName;
    private int marks;

    // constructor to initialize subject
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // method to get subject name
    public String getSubjectName() {
        return subjectName;
    }

    // method to get subject marks
    public int getMarks() {
        return marks;
    }
}

// class to claculate grade
class GradeCalculator {
    // variables
    private char grade;

    // constructer
    public GradeCalculator() {

    }

    // method to calculate grade
    public char calculateGrade(Subject subject) {
        int marks = subject.getMarks();
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    // method to get grade
    public char getGrade() {
        return grade;
    }
}

class SchoolResults {
    public static void main(String[] args) {
        // Create Subjects object
        Subject math = new Subject("Mathematics", 85);
        Subject science = new Subject("Science", 92);

        // create Student object
        Student student = new Student("Rajveer", 88);

        // addd Subjects to the student
        student.addSubject(math);
        student.addSubject(science);

        // display student details
        student.displayStudentDetails();
    }
}
