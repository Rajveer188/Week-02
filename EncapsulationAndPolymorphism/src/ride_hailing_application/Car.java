package ride_hailing_application;

//class to represent car
class Car extends Vehicle implements GPS {
    //Attribute
    private String currentLocation;

    // constructor to initialize car
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    //override and implement abstract method
    @Override
    public double calculateFare(double distance) {
        double fare = distance * getRatePerKm();
        return fare;
    }
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}
