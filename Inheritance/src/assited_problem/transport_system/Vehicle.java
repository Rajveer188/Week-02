package assited_problem.transport_system;

//base class Vehicle
public class Vehicle {
    //Attribute
    private int maxSpeed;
    private String fuelType;

    //constructor to initialize vehicle
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    //method to show details
    public void displayInfo(){
        System.out.println("Max speed - " + maxSpeed +
                "\nfuel type - " + fuelType);
    }
}
