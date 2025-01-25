package assited_problem.animal_hierarchy;
//super class animal
public class Animal {
    //Attribute
    protected String name;
    protected int age;

    //constructor to initialize animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //method to make sound
    protected void makeSound(){
        System.out.println("Animal is making sound");
    };
}
