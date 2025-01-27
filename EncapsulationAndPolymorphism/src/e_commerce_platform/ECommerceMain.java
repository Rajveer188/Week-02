package e_commerce_platform;

public class ECommerceMain {
       //method to calculate total price
        public static void calculateFinalPrice(Product[] products) {
            for (Product product : products) {
                product.displayDetails();
                //get discount
                double discount = product.calculateDiscount();
                //get tax
                double tax = ((Taxable) product).calculateTax();
                //calculate final price
                double finalPrice = product.getPrice() + tax - discount;
                //print price
                System.out.println("Discount- " + discount);
                System.out.println("Tax- " + tax);
                System.out.println("Total price- " + finalPrice);
                //print tax details
                System.out.println(((Taxable) product).getTaxDetails());
            }
        }

        public static void main(String[] args) {
            //create object of each product
            Product electronics = new Electronics( "Smartphone", 02,25000);
            Product clothing = new Clothing("Earbuds",5, 1500);
            Product groceries = new Groceries("Rice", 4, 500);

            //create and store product to array
            Product[] products = new Product[3];
            products[0] = electronics;
            products[1] = clothing;
            products[2] = groceries;

            //method to calculate total price
            calculateFinalPrice(products);
        }
}