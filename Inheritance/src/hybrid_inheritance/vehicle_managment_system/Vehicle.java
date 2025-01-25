package hybrid_inheritance.vehicle_managment_system;

//superclass vehicle
public class Vehicle {
    //Attribute
    protected int maxSpeed;
    protected String model;

    // constructor to initialize vehicle
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    //method to display details
    public void displayDetails() {
        System.out.println("\nModel- " + model +
                "\nMax Speed - " + maxSpeed + " km/h");

    }
}
