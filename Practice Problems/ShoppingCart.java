//import scanner class
import java.util.Scanner;

class Product{
    //instance attribute
    private String productName;
    private final int productID;
    private double price;
    private int quantity;
    //static attribute
    static float discount = 0.0f;

    //constructer to initialze variables
    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }
    //static method to modify discount value
    public static void updateDiscount(float discount) {
        Product.discount = discount;
    }
    //method to calculate total price
    private double getTotalPrice(){
        double discountedPrice = price - (price * discount / 100);
        double total = discountedPrice * quantity;
        return total;
    }
    //method to display detials
    public void displayDetails(){
        double total = getTotalPrice();
        System.out.println("\nProduct name - " + productName +
                "\nProduct ID - "+ productID +
                "\nActual price - " + price +
                "\nQuantity - " + quantity +
                "\nDiscounted Price - " + total);
    }
}

public class ShoppingCart {
    //main method
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //get input
        System.out.println("enter product name - ");
        String productName = input.nextLine();
        System.out.println("Enter product id - ");
        int productID = input.nextInt();
        input.nextLine();
        System.out.println("Enter product price - ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Enter quantity of product");
        int quantity = input.nextInt();
        input.nextLine();

        System.out.println("Enter discount");
        float discount = input.nextFloat();

        //call method to modify discount
        Product.updateDiscount(discount);

        //create object of Product cart claas
        Product product = new Product(productName, productID, price, quantity);

        //Check if object is an instance of the product
        if (product instanceof Product) {
            product.displayDetails();
        }
        //close scanner object
        input.close();
    }
}
