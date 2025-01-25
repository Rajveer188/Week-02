package hierarchical_inheritance.school_system;

//base class
public class Person {
    //Attribute
    private String name;
    private int age;

    //constructor to initialize person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //method to display role
    public void displayRole(){
        System.out.println("this is a person");
    }
    //method to display  details
    public void displayDetails() {
        System.out.println("Name -  " + name +
                "\nage- " + age);
    }
}
