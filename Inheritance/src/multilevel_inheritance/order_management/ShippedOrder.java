package multilevel_inheritance.order_management;

//shiping class that extends order and serve as a super class for another class
public class ShippedOrder extends Order{
    //Attribute
    private int trackingNumber;

    //constructor to initialize shipped order details
    public ShippedOrder(int orderId, String date, int trackingNumber) {
        super(orderId, date);
        this.trackingNumber = trackingNumber;
    }

    //method to return the current order status
    public String getOrderStatus(){
        return "Order shipped";
    }
    //method to display order details
    public void displayOrder(){
        super.displayOrder();
        System.out.println(this.getOrderStatus());
        System.out.println("tracking number - " + trackingNumber);
    }
}
