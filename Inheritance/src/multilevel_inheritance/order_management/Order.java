package multilevel_inheritance.order_management;

import java.util.Date;

//super most class order
public class Order {
    //Attribute
    private int orderId;
    private String date;

    //constructor to initialize order details
    public Order(int orderId, String date) {
        this.orderId = orderId;
        this.date = date;
    }
    //method to return the current order status
    public String getOrderStatus(){
        return "Order placed";
    }
    //method to display order details
    public void displayOrder(){
        System.out.println(this.getOrderStatus());
        System.out.println("Order id - " + orderId +
                "\nOreder Date - " + date);
    }
}
