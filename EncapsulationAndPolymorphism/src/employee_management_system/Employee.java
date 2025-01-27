package employee_management_system;

//abstract class to represent employee
public abstract class Employee{
    //Attribute
    private String employeeId;
    private String name;
    private double baseSalary;

    //constructor to initialize employee
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    //getter and setter to initialize variable value
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0){
            System.out.println("invailid salary");
        }else {
            this.baseSalary = baseSalary;
        }
    }

    //abstract method to calculate Salary
    public abstract double calculateSalary();

    //method to display details
    public void displayDetails(){
        System.out.println("Employee name - " + name +
                "\nEmployee Id - " + employeeId);
    }
}
