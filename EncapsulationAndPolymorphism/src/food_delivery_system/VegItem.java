package food_delivery_system;

//class to represent veg item
class VegItem extends FoodItem implements Discountable {
    //Attribute
    private double discount;

    // constructor to initialize veg food item
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    //override and implement abstract methods
    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) * (1 - discount / 100);
        return total;
    }
    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }
    @Override
    public String getDiscountDetails() {
        return "Discount applied - " + discount + "%";
    }
}


