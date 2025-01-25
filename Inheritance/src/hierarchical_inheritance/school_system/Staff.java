package hierarchical_inheritance.school_system;

//class to represent staff
public class Staff extends Person{
    //Attribute
    private String department;

    //constructor to initialize staff
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    //overridden method to display role
    @Override
    public void displayRole() {
        System.out.println("This is a staff");
    }
    //method to display department
    public void displayDepartment() {
        System.out.println("Department- " + department);
    }
}
