package assited_problem.transport_system;

//class to represent Truck
public class Truck extends Vehicle{
    //Attribute
    private double loadingCapacity;

    //constructor to initialize truck
    public Truck(int maxSpeed, String fuelType, double loadingCapacity) {
        super(maxSpeed, fuelType);
        this.loadingCapacity = loadingCapacity;
    }
    //override method to display truck details
    @Override
    public void displayInfo() {
        System.out.println("\nTruck - ");
        super.displayInfo();
        System.out.println("Loading capacity - " + loadingCapacity + "Ton");
    }
}
