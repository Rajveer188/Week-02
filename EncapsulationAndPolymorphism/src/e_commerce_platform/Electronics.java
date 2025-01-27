package e_commerce_platform;

//class to represent electronics product
public class Electronics extends Product implements Taxable {
    //static attribute
    private static final double TAX_RATE = 0.18;
    private static final double DISCOUNT_RATE = 0.20;

    //constructor to initialize elcetronics product
    public Electronics (String name, int productId, double price) {
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
        return "electronics tax rate" + (TAX_RATE * 100) + "%";
    }
}
