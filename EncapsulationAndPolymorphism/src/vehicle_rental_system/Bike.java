package vehicle_rental_system;

//class to represent bike
class Bike extends Vehicle implements Insurable {
    //Attribute
    private static final double INSURANCE_RATE = 0.02;

    // constructor to initialize bike
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
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
        return "Bike Insurance Rate: " + (INSURANCE_RATE * 100) + "%";
    }
}

