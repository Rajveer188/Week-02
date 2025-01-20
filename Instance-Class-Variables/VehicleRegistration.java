//import scanner class
import java.util.Scanner;

class Vehicle {
    // instance variable
    private String ownerName;
    private String vehicleType;
    // class variable
    private static double registrationFee = 1000.0;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name- " + ownerName +
                "\nVehicle Type- " + vehicleType +
                "\nRegistration Fee- " + registrationFee);
    }

    // method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

class VehicleRegistration {
    // main method
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // get input for product details
        System.out.println("Enter name of vehicle owner");
        String ownerName = input.nextLine();

        System.out.println("Enter vehicle type");
        String vehicleType = input.nextLine();

        // Create vehicle objects
        Vehicle vehicle = new Vehicle(ownerName, vehicleType);

        // display details of vehicles before updating the registration fee
        System.out.println("Before Updating Registration Fee-");
        vehicle.displayVehicleDetails();
        System.out.println();

        // Update the registration fee
        System.out.println("Enter new vehicle registration fee");
        double newFee = input.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        // Display details of vehicles after updating the registration fee
        System.out.println("\nAfter Updating Registration Fee-");
        vehicle.displayVehicleDetails();
        // close scanner
        input.close();
    }
}