package assited_problem.employee_management_system;

public class EmployeeMain{
    public static void main(String[] args) {
        //create object of manager , developer and inten
        Employee manager = new Manager("Rajveer", 20, 987654,10);
        Employee developer = new Developer("Darshan", 22, 876543, "Java");
        Employee intern = new Intern("Aadi", 23,7654,"database");

        //call method to show different behaviour of each class
        System.out.println("Manager - ");
        manager.displayDetails();
        System.out.println("\nDeveloper - ");
        developer.displayDetails();
        System.out.println("\nIntern - ");
        intern.displayDetails();
    }
}
