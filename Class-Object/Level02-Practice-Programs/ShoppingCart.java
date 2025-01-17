//import scanner class
import java.util.Scanner;

class CartItem {
    //Attribute
    private String itemName;
    private double price;
    private int quantity;
    private CartItem[] cart;
    private int cartSize;

    //constructer to initialze object
    public CartItem() {
        cart = new CartItem[5];
        cartSize = 0;
    }
    public CartItem(String itemName, double price, int quantity) {
        this();
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    //method to add item in cart
    void addItem(String itemName, double price, int quantity) {
        //if array is full then increase array size
        if (cartSize == cart.length) {
            CartItem[] newCart = new CartItem[cart.length + 10];
            System.arraycopy(cart, 0, newCart, 0, cart.length);
            cart = newCart;
        }
        cart[cartSize++] = new CartItem(itemName, price, quantity);
    }

    //method to remove item from cart
    void removeItem(String itemName) {
        for (int i = 0; i < cartSize; i++) {
            if (cart[i].itemName.equals(itemName)) {
                for (int j = i; j < cartSize - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[--cartSize] = null;
                break;
            }
        }
    }

    //method to display total cost
    void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < cartSize; i++) {
            totalCost += cart[i].price * cart[i].quantity;
        }
        System.out.println("Total Cost- " + totalCost);
    }
}

class ShoppingCart {
    //main method
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new java.util.Scanner(System.in);
        //create object of cart item class
        CartItem cart = new CartItem();

        while (true) {
            System.out.println("\n1.Add Item\n2. Remove Item\n3. Display Total Cost\n4.Exit");
            System.out.print("Enter your choice - ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name- ");
                    String itemName = input.nextLine();
                    System.out.print("Enter price- ");
                    double price = input.nextDouble();
                    System.out.print("Enter quantity-");
                    int quantity = input.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove- ");
                    String removeItemName = input.nextLine();
                    cart.removeItem(removeItemName);
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    System.out.println("Exit");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
