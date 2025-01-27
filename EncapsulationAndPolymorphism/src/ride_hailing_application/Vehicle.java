package ride_hailing_application;

//abstract class to represent vehicle
abstract class Vehicle {
    //Attribute
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // constructor to initialize vehicle
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters and setters
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Abstract method for fare calculation
    public abstract double calculateFare(double distance);

    //method to display vehicle details
    public void getVehicleDetails() {
        System.out.println("\nVehicle Id - " + vehicleId +
                "\nDriver name - " + driverName +
                "\nRate per KM - : " + ratePerKm);
    }
}
