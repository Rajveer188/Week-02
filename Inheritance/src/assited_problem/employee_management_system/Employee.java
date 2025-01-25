package assited_problem.employee_management_system;

//base class employee
public class Employee{
    //attribute
    protected String name;
    protected int id;
    protected double salary;

    //constructer to initialize employee
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    //method to display employee details
    protected void displayDetails(){
        System.out.println("Employee name - " + name +
                "\nEmployee ID - " + id +
                "\nEmployee salary - " + salary);
    }
}
