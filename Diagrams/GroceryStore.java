import java.util.ArrayList;
import java.util.List;

//class to represent product
class Product {
    // attribute
    private int productId;
    private String productName;
    private double price;

    // constructor to initialize product
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // method to get product price
    public double getPrice() {
        return price;
    }

    // method to get product details
    public String getProductDetails() {
        return "Product ID- " + productId + ", Name- " + productName + ", Price- " + price;
    }
}

// class to represent a customer
class Customer {
    private int customerId;
    private String customerName;
    private List<Product> products;

    // constructer to initialize customer
    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }

    // method to add a product
    public void addProduct(Product product) {
        products.add(product);
    }

    // method to get product list
    public List<Product> getProducts() {
        return products;
    }

    // method to get customer details
    public String getCustomerDetails() {
        return "Customer ID- " + customerId + ", Name- " + customerName;
    }
}

// class to generate bill
class BillGenerator {
    // constuctor
    public BillGenerator() {

    }

    // method to calculate total bill
    public double calculateTotal(Customer customer) {
        double total = 0.0;
        for (Product product : customer.getProducts()) {
            total += product.getPrice();
        }
        return total;
    }

    // method to generate bill details
    public void generateBill(Customer customer) {
        System.out.println("Customer- \n" + customer.getCustomerDetails());
        System.out.println("Purchased Products- ");

        for (Product product : customer.getProducts()) {
            System.out.println(product.getProductDetails());
        }

        double total = calculateTotal(customer);
        System.out.println("Total Bill- " + total);
    }
}

public class GroceryStore {
    public static void main(String[] args) {
        // create Products object
        Product apples = new Product(1, "Apples", 6.0);
        Product milk = new Product(2, "Milk", 2.0);

        // create Customer object
        Customer customer = new Customer(101, "Alice");
        customer.addProduct(apples);
        customer.addProduct(milk);

        // generate Bill and print
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(customer);
    }
}