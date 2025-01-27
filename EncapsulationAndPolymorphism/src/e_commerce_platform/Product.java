package e_commerce_platform;

//abstract class to represent product
public abstract class Product {
    //Attribute
    private int productId;
    private String name;
    private double price;

    //constructor to initialize product
    public Product(String name, int productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }
    //abstract method to calculate discount
    public abstract double calculateDiscount();

    //getter to aceess variable
    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    //setter to set variables value
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Invailid price");
        }else{
            this.price = price;
        }
    }

    //method to display details
    public void displayDetails() {
        System.out.println("\nProduct name - "+ name +
                "\nProduct id - " + productId +
                "\nprice - "+ price);
    }
}
