package employee_management_system;

//class to represent part time employee
public class PartTimeEmployee extends Employee implements Department{
    //Abstract
    private int workHours;
    private double salaryPerHour;
    private String department;

    //constructor to initialize part time employee
    public PartTimeEmployee(String employeeId, String name, int workHours, double salaryPerHour) {
        super(employeeId, name, 0);
        this.workHours = workHours;
        this.salaryPerHour = salaryPerHour;
    }

    //override and implement abstract methods
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }
    @Override
    public String getDepartmentDetails() {
        return department;
    }
    @Override
    public double calculateSalary() {
        double salary = workHours * salaryPerHour;
        return salary;
    }
}
