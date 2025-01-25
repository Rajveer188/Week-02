package hybrid_inheritance.vehicle_managment_system;

//class to represent petrol vehicle
public class PetrolVehicle extends Vehicle implements Refuelable{
    // constructor to initialize petrol vehicle
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    //override method to implement refuel method
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle");
    }
}
