package employee_management_system;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        //list to store employee object
        List<Employee> employeesList = new ArrayList<>();

        //create object of full time and part time employee
        Employee fullTimeEmployee = new FullTimeEmployee("A01", "Rajveer", 98876);
        Employee partTimeEmployee = new PartTimeEmployee("V101", "Hemant",6, 500);

        //assign department to employees
        ((Department)fullTimeEmployee).assignDepartment("Cloud department");
        ((Department)partTimeEmployee).assignDepartment("Technical support");

        //add object to list
        employeesList.add(fullTimeEmployee);
        employeesList.add(partTimeEmployee);

        //display details of employee
        for (Employee employee : employeesList){
            String department = ((Department)employee).getDepartmentDetails();
            double salary = employee.calculateSalary();

            employee.displayDetails();
            System.out.println("Salary - " + salary +
                    "\nDepartment - " + department +"\n");
        }
    }
}
