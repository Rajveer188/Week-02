package multilevel_inheritance.order_management;


public class OnlineRetail {
    public static void main(String[] args) {
        Order deliveryOrder = new DeliveredOrder(001, "24-01-2025", 154322, "28-01-2025");
        //display order details
        deliveryOrder.displayOrder();
    }
}
