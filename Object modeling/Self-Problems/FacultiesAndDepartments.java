import java.util.ArrayList;

//class to represent faculties
class Faculty {
    //attribute
    private String name;
    private String specialization;

    // Constructor to initialize faculty object
    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    // Method to display faculty details
    public void displayFacultyDetails() {
        System.out.println("Faculty Name- " + name +
                 "\nSpecialization- " + specialization);
    }
}
//class to represent department
class Department {
    private String departmentName;
    private ArrayList<Faculty> facultyList;

    // constructor to initialize department object
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyList = new ArrayList<>();
    }

    // method to add a faculty to department
    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    //method to display department details
    public void displayDepartmentDetails() {
        System.out.println("\nDepartment- " + departmentName);
        System.out.println("Faculty Members - ");
        for (Faculty faculty : facultyList) {
            faculty.displayFacultyDetails();
        }
    }
}
//class to represent university
class University {
    //attribute
    private String universityName;
    private ArrayList<Department> departmentList;

    //constructor to initialize university
    public University(String universityName) {
        this.universityName = universityName;
        this.departmentList = new ArrayList<>();
    }

    //method to add department to university
    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    // Method to display university details
    public void displayUniversityDetails() {
        System.out.println("\nUniversity- " + universityName);
        System.out.println("Departments- ");
        for (Department department : departmentList) {
            department.displayDepartmentDetails();
        }
    }
}
public class FacultiesAndDepartments {

    public static void main(String[] args) {
        //create faculty object
        Faculty rajFaculty = new Faculty("Raj", "Computer Science");
        Faculty veerFaculty = new Faculty("Veer", "Quantom physics");
        Faculty darshanFaculty = new Faculty("Darshan", "Physics");

        // Create departments
        Department csDepartment = new Department("Computer Science");
        Department physicsDepartment = new Department("Physics");

        // add faculty members to departments
        csDepartment.addFaculty(rajFaculty);
        physicsDepartment.addFaculty(veerFaculty);
        physicsDepartment.addFaculty(darshanFaculty);

        // create university
        University university = new University("RGPV University");

        //add departments to university
        university.addDepartment(csDepartment);
        university.addDepartment(physicsDepartment);

        // display university details
        university.displayUniversityDetails();

        // showing independent faculty member details
        System.out.println("\nIndependent Faculty Member-");
        darshanFaculty.displayFacultyDetails();
    }
}