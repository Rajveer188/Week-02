package food_delivery_system;

//class to represent non-veg item
class NonVegItem extends FoodItem implements Discountable {
    //Attribute
    private double discount;
    private final double nonVegCharge = 75;

    // constructor to initialize non-veg food item
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    //override and implement abstract methods
    @Override
    public double calculateTotalPrice() {
        double basePrice = (getPrice() * getQuantity()) + nonVegCharge;
        double total = basePrice * (1 - discount / 100);
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

