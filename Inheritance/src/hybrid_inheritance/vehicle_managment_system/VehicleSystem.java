package hybrid_inheritance.vehicle_managment_system;

public class VehicleSystem {
    public static void main(String[] args) {
        //create object of electric and petrol vehicle
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla Model S", 200);
        PetrolVehicle petrolVehicle = new PetrolVehicle("Ford Mustang", 250);

        //display details of petrol and electric vehicle
        electricVehicle.displayDetails();
        electricVehicle.charge();

        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}
