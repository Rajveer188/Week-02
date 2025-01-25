package assited_problem.employee_management_system;

//class to represent manager
public class Developer extends Employee{
    //Attribute
    private String programmingLanguage;

    //constructer to initialize developer
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    //override methoe to display employee details
    @Override
    protected void displayDetails() {
        super.displayDetails();
        System.out.println("Programming language - " + programmingLanguage);
    }
}
