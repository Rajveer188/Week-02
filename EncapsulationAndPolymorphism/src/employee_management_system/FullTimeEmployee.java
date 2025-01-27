package employee_management_system;

// class to represent full employee
public class FullTimeEmployee extends Employee implements Department{
    //Attribute
    private String department;

    //constructor to initialize full time employee
    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
    //override and implement abstract methods
    @Override
    public double calculateSalary() {
        double salary = getBaseSalary();
        return salary;
    }
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }
    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
