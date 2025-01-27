package vehicle_rental_system;

// Abstract class to represent vehicle
abstract class Vehicle {
    //Attribute
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // constructor to initialize vehicle
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters and Setters method
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        if (vehicleNumber != null) {
            this.vehicleNumber = vehicleNumber;
        } else {
            System.out.println("Vehicle number cannot be null");
        }
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        if (type != null ) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Type cannot be null");
        }
    }
    public double getRentalRate() {
        return rentalRate;
    }
    public void setRentalRate(double rentalRate) {
        if (rentalRate > 0) {
            this.rentalRate = rentalRate;
        } else {
            throw new IllegalArgumentException("rental rate must be greater than 0");
        }
    }

    //abstract method for cost calculation
    public abstract double calculateRentalCost(int days);

    //method to display vehicle details
    public void displayDetails() {
        System.out.println("\nVehicle Number - " + vehicleNumber +
        "\nType- " + type +
        "\nRental Rate - " + rentalRate);
    }
}
