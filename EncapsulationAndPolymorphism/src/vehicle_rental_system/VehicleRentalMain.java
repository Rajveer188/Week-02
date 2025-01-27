package vehicle_rental_system;

public class VehicleRentalMain {
    public static void main(String[] args){
        //create array and store object in it
        Vehicle[] vehicles = {
                new Car("MP27XY3212", 1000),
                new Bike("MP43XY1234", 500),
                new Truck("MP56XY9876", 2000)
        };

        int rentalDays = 5;

        //Display rental details
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            //get rental cost
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            //get insurance cost
            double insuranceCost =  ((Insurable) vehicle).calculateInsurance();
            System.out.println("Rental cost for " + rentalDays + " days - " + rentalCost);
            System.out.println("Insurance cost- " + insuranceCost);
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
            System.out.println("Total Cost - " + (rentalCost + insuranceCost));
        }
    }
}
