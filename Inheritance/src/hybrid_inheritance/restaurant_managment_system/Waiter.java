package hybrid_inheritance.restaurant_managment_system;

//class to represent waiter
public class Waiter extends Person implements Worker{
    // constructor to initialize waiter
    public Waiter(String name, int id) {
        super(name, id);
    }
    //override and implementation of performDuties()
    @Override
    public void performDuties() {
        System.out.println("Duties- Serving customers and taking orders");
    }
}
