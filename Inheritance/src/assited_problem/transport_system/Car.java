package assited_problem.transport_system;

//class to represent car
public class Car extends Vehicle{
    //Attribute
    private int seatCapacity;

    //constructor to initialize Car
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    //override method to display car details
    @Override
    public void displayInfo() {
        System.out.println("\nCar - ");
        super.displayInfo();
        System.out.println("seat capacity - " + seatCapacity);
    }
}
