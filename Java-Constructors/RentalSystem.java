
//import scanner object
import java.util.Scanner;

class CarRental {
    // Attribute
    private String customerName;
    private String carModel;
    private int rentalDays;
    private final static int pricePerDay = 1000;

    // constructer to initialize retal details
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // method to calculate total cost
    public double getTotalcost() {
        double totalCost = pricePerDay * rentalDays;
        return totalCost;
    }

    // method to display
    public void displayTotalCost() {
        double cost = getTotalcost();
        System.out.println("Total cost for " + rentalDays + " is " + cost);
    }
}

class RentalSystem {
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // input rental details
        System.out.println("Enter customer name -");
        String customerName = input.nextLine();
        System.out.println("Enter car model -");
        String carModel = input.nextLine();
        System.out.println("Enter rental days -");
        int rentalDays = input.nextInt();

        // create object and get total cost
        CarRental carRental = new CarRental(customerName, carModel, rentalDays);
        carRental.displayTotalCost();

        // close scanner
        input.close();
    }
}