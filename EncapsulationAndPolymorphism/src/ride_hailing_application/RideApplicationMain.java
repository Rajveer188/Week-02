package ride_hailing_application;

public class RideApplicationMain {
    public static void main(String[] args) {
        //create vehicle object
        Vehicle car = new Car("C101", "Darshan", 20);
        Vehicle bike = new Bike("B202", "Rajveer", 15);
        Vehicle auto = new Auto("C303", "Aditya", 10);

        //update GPS locations
        ((GPS) car).updateLocation("Indrapuri");
        ((GPS) bike).updateLocation("VIP Road");
        ((GPS) auto).updateLocation("New Market");

        // create array to storevehicles
        Vehicle[] vehicles = {car, bike, auto};

        //calculate fares
        double distance = 25;
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km " + vehicle.calculateFare(distance));
            System.out.println("Current Location- " + ((GPS) vehicle).getCurrentLocation());
        }
    }
}
