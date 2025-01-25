package assited_problem.employee_management_system;

//class to represent manager
public class Manager extends Employee{
    //Attribute
    private int teamSize;

    //constructer to initialize manager
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    //override methoe to display employee details
    @Override
    protected void displayDetails() {
        super.displayDetails();
        System.out.println("Team size - " + teamSize);
    }
}
