package food_delivery_system;

//abstract class food item
abstract class FoodItem {
    //Attribute
    private String itemName;
    private double price;
    private int quantity;

    // constructor to initialize food item
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    //getters and setters
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    // abstract method to calculate total price
    public abstract double calculateTotalPrice();

    //method to get item details
    public String getItemDetails() {
        return "Item Name - " + itemName + "\nPrice- " + price + "\nQuantity - " + quantity;
    }
}


