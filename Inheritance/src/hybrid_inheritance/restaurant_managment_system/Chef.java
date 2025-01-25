package hybrid_inheritance.restaurant_managment_system;

//class to represent chef
public class Chef extends Person implements Worker {
    // constructor to initialize chef
    public Chef(String name, int id) {
        super(name, id);
    }
    //override and implementation of performDuties()
    @Override
    public void performDuties() {
        System.out.println("Duties- cooking meals");
    }
}
