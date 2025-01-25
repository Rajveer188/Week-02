package hybrid_inheritance.restaurant_managment_system;

//base class person
public class Person {
    //Attribute
    protected String name;
    protected int id;

    // constructor to initialize person
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    // method to display details
    public void displayDetails() {
        System.out.println("\nName- " + name +
                "\nID - " + id);
    }
}
