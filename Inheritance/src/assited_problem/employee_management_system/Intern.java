package assited_problem.employee_management_system;

//class to represent intern
public class Intern extends Employee{
    //Attribute
    private String skill;

    //constructer to initialize intern
    public Intern(String name, int id, double salary, String skill) {
        super(name, id, salary);
        this.skill = skill;
    }
    //override methoe to display employee details
    @Override
    protected void displayDetails() {
        super.displayDetails();
        System.out.println("Intern skill is - " + skill);
    }
}

