
//scanner import class
import java.util.Scanner;

class Item {
    // attribute
    int itemCode;
    String itemName;
    double price;

    // constucter to initialze objec
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // method to display item details
    void displayDetails(int quantity, double total) {
        System.out.println("Item code - " + itemCode +
                "\nItem name - " + itemName +
                "\n Item price - " + price +
                "\nfor " + quantity + " item total price is " + total);
    }
    // method to find total cost for given quantity
    double getTotalCost(int quantity){
        //calculate total price
        double total = price * quantity;
        return total;
    }
}

public class TrackInventory {
 //main method
 public static void main(String[] args) {
    // create object of scanner class
    Scanner input = new Scanner(System.in);

    // input code, name and price
    System.out.println("Enter item code - ");
    int code = input.nextInt();

    System.out.println("Enter item name - ");
    String name = input.next();

    System.out.println("Enter item price - ");
    double price = input.nextDouble();

    //create object of item class
    Item item = new Item(code, name, price);

    System.out.println("Enter quantity - ");
    int quantity = input.nextInt();

    //calculate total price
    double totalCost = item.getTotalCost(quantity);

    //display area
    item.displayDetails(quantity, totalCost);

    //close scanner
    input.close();
 }
}
