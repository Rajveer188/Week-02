package vehicle_rental_system;

//class to represent car
class Car extends Vehicle implements Insurable {
    //Attribute
    private static final double INSURANCE_RATE = 0.04;

    // constructor to initialize car
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
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
        return "Car insurance rate- " + (INSURANCE_RATE * 100) + "%";
    }
}
