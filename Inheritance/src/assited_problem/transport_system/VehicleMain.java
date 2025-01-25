package assited_problem.transport_system;

//main class to demonstrate vehicle and transport system
public class VehicleMain {
    public static void main(String[] args) {
        //create object of car, truck and motorcycle
        Vehicle car = new Car(220, "Petrol",5);
        Vehicle truck = new Truck(150, "Diesel", 500);
        Vehicle motorcyles = new Motorcycle(180, "Petrol", "Pulsar");

        //create an array to store vehicle object and store it
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = truck;
        vehicles[2] = motorcyles;

        //display details of each vehicle
        for(Vehicle vehicle : vehicles){
            vehicle.displayInfo();
        }
    }
}
