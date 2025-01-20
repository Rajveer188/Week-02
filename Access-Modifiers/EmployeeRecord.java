
// import scanner class
import java.util.Scanner;

//base Employee class
class Employee {
    // Attribute
    public String employeeID;
    protected String department;
    private double salary;

    // constructor to initialize employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // method to modify the salary
    public void modifySalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }

    // method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID- " + employeeID +
                "\nDepartment- " + department +
                "\nSalary- " + salary);
    }
}

// subclass Manager
class Manager extends Employee {
    // constructor for Manager
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // method to display manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID- " + employeeID +
                "\nDepartment- " + department);
    }
}

// main class
public class EmployeeRecord {
    // main method
    public static void main(String[] args) {
        // create scanner class object
        Scanner input = new Scanner(System.in);

        // take input for Employee
        System.out.println("Enter Employee ID-");
        String employeeID = input.nextLine();

        System.out.println("Enter Employee Department-");
        String employeeDepartment = input.nextLine();

        System.out.println("Enter Employee salary-");
        double employeeSalary = input.nextDouble();

        // create an Employee object
        Employee employee = new Employee(employeeID, employeeDepartment, employeeSalary);
        System.out.println("\nEmployee Details-");
        employee.displayEmployeeDetails();

        // modify salary
        System.out.println("\nEnter Updated Salary for Employee-");
        double updatedSalary = input.nextDouble();
        employee.modifySalary(updatedSalary);

        System.out.println("\nUpdated Employee details-");
        employee.displayEmployeeDetails();

        // take input for Manager
        input.nextLine();
        System.out.println("\nEnter Manager ID-");
        String managerID = input.nextLine();

        System.out.println("Enter Manager Department-");
        String managerDepartment = input.nextLine();

        System.out.println("Enter Manager Salary-");
        double managerSalary = input.nextDouble();

        // Create a Manager object
        Manager manager = new Manager(managerID, managerDepartment, managerSalary);
        System.out.println("\nManager Details-");
        manager.displayManagerDetails();

        // Close the scanner
        input.close();

    }
}
