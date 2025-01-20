///import scanner class
import java.util.Scanner;

class Vehicle {
    //instance variable
    private String ownerName;
    private String vehicleType;
    //final variable
    private final String registrationNumber;
    //static variable
    static int registrationFee;


    //constructor to initialize instance variables
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    //Static method to modify registration fee
    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    // method to display registration details
    public void displayDetails() {
        System.out.println("Owner Name- " + ownerName +
         "\nVehicle Type- " + vehicleType +
         "\nRegistration Number- " + registrationNumber +
         "\nRegistration Fee- " + registrationFee);

    }
}
class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Set registration fee
        Vehicle.updateRegistrationFee(500);

        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //get input
        System.out.println("enter owner name - ");
        String ownerName = input.nextLine();
        System.out.println("Enter vehicle type - ");
        String vehicleType = input.nextLine();
        System.out.println("Enter registration number - ");
        String registrationNumber = input.nextLine();

        // Create vehicle objects
        Vehicle vehicle = new Vehicle(ownerName, vehicleType, registrationNumber);

        // Display registration details if objects are instances of the Vehicle class
        if (vehicle instanceof Vehicle) {
            System.out.println("\nDetails with old registration fee");
            vehicle.displayDetails();
        }
        System.out.println("\nEnter new registration fee");
        int newRegistrationFee = input.nextInt();

        //update registration fee
        Vehicle.updateRegistrationFee(newRegistrationFee);

        if (vehicle instanceof Vehicle) {
            System.out.println("\nDetails after updating registration fee");
            vehicle.displayDetails();
        }
        //close scanner
        input.close();
    }
}

