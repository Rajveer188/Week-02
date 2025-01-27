package e_commerce_platform;

//class to represent clothing product
public class Clothing extends Product implements Taxable {
    //static and final variables
    private static final double TAX_RATE = 0.8;
    private static final double DISCOUNT_RATE = 0.15;

    //constructor to initialize clothing product
    public Clothing (String name, int productId, double price) {
        super(name, productId, price);
    }

    //override and implement abstract methods
    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }
    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }
    @Override
    public String getTaxDetails() {
        return "clothing tax rate - " + (TAX_RATE * 100) + "%";
    }
}
