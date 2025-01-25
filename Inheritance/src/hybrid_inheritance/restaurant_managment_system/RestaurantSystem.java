package hybrid_inheritance.restaurant_managment_system;

public class RestaurantSystem {
    public static void main(String[] args) {
        //create object of chef and waiter
        Chef rakeshChef = new Chef("Rakesh", 101);
        Waiter chotuWaiter = new Waiter("Chotu", 102);

        //display details and duties of each
        rakeshChef.displayDetails();
        rakeshChef.performDuties();
        chotuWaiter.displayDetails();
        chotuWaiter.performDuties();
    }
}
