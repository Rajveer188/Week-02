
// import scanner class
import java.util.Scanner;

//class to store employee data and display it
class Employee {
    // define attribute
    String name;
    int id;
    double salary;

    // constructer to initialize employee details
    Employee(String name, int id, double salary) {
        // copy parameter value into actual variable
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // method to display employee details
    void displayDetails() {
        // print statemetn
        System.out.println("Name - " + this.name +
                "\nId - " + this.id +
                "\nSalary - " + this.salary);
    }
}

// class to access Employee class
class EmployeeDetails {
    // main method
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // input name, id and salary
        System.out.println("Enter name - ");
        String name = input.nextLine();

        System.out.println("Enter id - ");
        int id = input.nextInt();

        System.out.println("Enter salary - ");
        double salary = input.nextDouble();

        // create object of employee class
        Employee employee = new Employee(name, id, salary);
        // call method to display details
        employee.displayDetails();

        // close scanner
        input.close();
    }

}