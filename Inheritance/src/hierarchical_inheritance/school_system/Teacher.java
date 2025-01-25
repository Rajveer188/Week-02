package hierarchical_inheritance.school_system;

//class to represent teacher
public class Teacher extends Person{
    //Attribute
    private String subject;

    //constructor to initialize teacher
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    //overridden method to display role
    @Override
    public void displayRole() {
        System.out.println("This is a teacher");
    }

    // Method to display subject
    public void displaySubject() {
        System.out.println("Teaches- " + subject);
    }
}
