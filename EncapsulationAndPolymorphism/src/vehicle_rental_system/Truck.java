package vehicle_rental_system;

//class to represent truck
class Truck extends Vehicle implements Insurable {
    //Attribute
    private static final double INSURANCE_RATE = 0.05;

    // constructor to initialize truck
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    //override and implement abstract methods
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Rate: " + (INSURANCE_RATE * 100) + "%";
    }
}
