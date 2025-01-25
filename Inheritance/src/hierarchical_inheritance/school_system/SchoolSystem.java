package hierarchical_inheritance.school_system;

public class SchoolSystem {
    public static void main(String[] args) {
        //create object of teacher student and staff
        Teacher teacher = new Teacher("MR. verma", 40, "Mathematics");
        Student student = new Student("Sanjay", 16, "12th Grade");
        Staff staff = new Staff("Keshav", 35, "Scholar department");

        // display details ofTeacher
        teacher.displayDetails();
        teacher.displayRole();
        teacher.displaySubject();
        System.out.println();

        //display details for the Student
        student.displayDetails();
        student.displayRole();
        student.displayGrade();
        System.out.println();

        // display details for the Staff
        staff.displayDetails();
        staff.displayRole();
        staff.displayDepartment();
    }
}
