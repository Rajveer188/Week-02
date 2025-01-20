//import scanner class
import java.util.Scanner;

class Product {
    // instance variable
    private String productName;
    private double price;
    // class variable
    private static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        // increment total products when object is created
        totalProducts++;
    }

    // Instance method to display the details
    public void displayProductDetails() {
        System.out.println("Product Name- " + productName +
                "\nPrice- " + price);
    }

    // Class method to display the total\products
    public static void displayTotalProducts() {
        System.out.println("\nTotal Products - " + totalProducts);
    }
}

public class ProductInvetory {
    // main method
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // get input for product details
        System.out.println("Enter name of 1st product");
        String firstProductName = input.nextLine();

        System.out.println("Enter price of 1st product");
        double firstProductPrice = input.nextDouble();

        System.out.println("Enter name of 2nd product");
        String secondProductName = input.next();

        System.out.println("Enter price of 2nd product");
        double secondProductPrice = input.nextDouble();

        // Create product objects
        Product product1 = new Product(firstProductName, firstProductPrice);
        Product product2 = new Product(secondProductName, secondProductPrice);

        // Display details
        System.out.println("Product 1 Details-");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details-");
        product2.displayProductDetails();

        // Display the totalproducts
        Product.displayTotalProducts();

        // close scanner
        input.close();

    }
}