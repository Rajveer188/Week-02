package hybrid_inheritance.vehicle_managment_system;

//class to represent Electric vehicle
public class ElectricVehicle extends Vehicle{

    // constructor to initialize electric vehicle
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    //method to charge ElectricVehicle
    public void charge() {
        System.out.println("electric vehicle is charging");
    }
}
