package e_commerce_platform;

//class to represent groceries product
public class Groceries extends Product implements Taxable{
    private static final double DISCOUNT_RATE = 0.04;
    private static final double TAX_RATE = 0.09;

    //constructor to initialize groceries product
    public Groceries (String name, int productId, double price) {
        super(name, productId, price);
    }

    //override and implement abstract methods
    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }
    @Override
    // Groceries are not taxable
    public String getTaxDetails() {
        return "groceries tax rate - " + (TAX_RATE * 100) + "%";
    }
    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }
}
