package multilevel_inheritance.order_management;

//delivery class that exteds shipped order
public class DeliveredOrder extends ShippedOrder {
    //Attribute
    private String deliveryDate;

    //constructor to initialize delivery details
    public DeliveredOrder(int orderId, String date, int trackingNumber, String deliveryDate) {
        super(orderId, date, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    //method to return the current order status
    public String getOrderStatus(){
        return "Order Delivered";
    }
    //method to display order details
    public void displayOrder(){
        super.displayOrder();
        System.out.println(this.getOrderStatus());
        System.out.println("delivery date - " + deliveryDate);
    }
}
