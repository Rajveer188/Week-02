package hierarchical_inheritance.school_system;

//class to represent student
public class Student extends Person{
    //Attribute
    private String grade;

    //constructor to initialize Student
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    //overridden method to display role
    @Override
    public void displayRole() {
        System.out.println("This is a student");
    }
    //method to display grade
    public void displayGrade() {
        System.out.println("Grade- " + grade);
    }

}
