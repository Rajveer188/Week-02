package assited_problem.transport_system;

//class to represent motor cycle
public class Motorcycle extends Vehicle{
    //Attribute
    private String brandName;

    //constructor to initialize motorcycle
    public Motorcycle(int maxSpeed, String fuelType, String brandName) {
        super(maxSpeed, fuelType);
        this.brandName = brandName;
    }
    //override method to display motorcylce details
    @Override
    public void displayInfo() {
        System.out.println("\nMotorcycle - ");
        super.displayInfo();
        System.out.println("Motorcycle brand - " + brandName);
    }
}
