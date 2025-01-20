///import scanner class
import java.util.Scanner;

class Patient {
    //instance variables
    private String name;
    private int age;
    private String ailment;
    //final variables
    private final String patientID;
    // Static variable
    static int totalPatients = 0;
    static String hospitalName;

    // Constructor to initialize instance variable
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        //increment count of total patients
        totalPatients++; 
    }

    //static method to get total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // method to display patient details
    public void displayDetails() {
        System.out.println("\nHospital- " + hospitalName +
        "\nPatient ID- " + patientID +
        "\nName- " + name +
        "\nAge- " + age +
        "\nAilment- " + ailment);     
    }
}

class HospitalManagementSystem {
    //main method
    public static void main(String[] args) {
         //create object of scanner class
         Scanner input = new Scanner(System.in);

         System.out.println("Enter hospital name");
         String hospitalName = input.nextLine();
        // set the hospital name
        Patient.hospitalName = hospitalName;

        //get input
        System.out.println("\nPatient 1-");
        System.out.println("Enter Patient name - ");
        String name1 = input.nextLine();
        System.out.println("Enter Patient age - ");
        int age1 = input.nextInt();
        input.nextLine();
        System.out.println("Enter Patient ailment - ");
        String ailment1 = input.nextLine();
        System.out.println("Enter Patient id - ");
        String patientID1 = input.nextLine();

        System.out.println("\nPatient 2-");
        System.out.println("Enter Patient name - ");
        String name2 = input.nextLine();
        System.out.println("Enter Patient age - ");
        int ag2 = input.nextInt();
        input.nextLine();
        System.out.println("Enter Patient ailment - ");
        String ailment2 = input.nextLine();
        System.out.println("Enter Patient id - ");
        String patientID2 = input.nextLine();

        // Create patient objects
        Patient patient1 = new Patient(name1, age1, ailment1, patientID1);
        Patient patient2 = new Patient(name2, ag2, ailment2, patientID2);

        //get total patient
        int totalPatients = Patient.getTotalPatients();
        //display total number of patients
        System.out.println("\nTotal number of Patients - " + totalPatients);

        //display details if the objects are instances of the Patient class
        if (patient1 instanceof Patient) {
            patient1.displayDetails();
        }

        if (patient2 instanceof Patient) {
            patient2.displayDetails();
        }
        //close scanner object
        input.close();
    }
}
