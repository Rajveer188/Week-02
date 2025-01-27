package food_delivery_system;

import java.util.List;
import java.util.ArrayList;
public class DeliverySystemMain {
    public static void main(String[] args) {
        // Create a list to store food item

        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Kaju curry", 250, 3));
        order.add(new NonVegItem("Butter Chicken", 300, 2));

        //apply discounts
        // 10% discount on veg
        ((Discountable) order.get(0)).applyDiscount(10);
        // 5% discount on non-veg
        ((Discountable) order.get(1)).applyDiscount(5);

        // Process order
        double totalOrderPrice = 0;
        for (FoodItem item : order) {
            System.out.println("\n" + item.getItemDetails());
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println(discountableItem.getDiscountDetails());
            }
            double itemTotal = item.calculateTotalPrice();
            System.out.println("Total Price - " + itemTotal);
            totalOrderPrice += itemTotal;
        }

        System.out.println("\nTotal Order Price - " + totalOrderPrice);
    }
}
