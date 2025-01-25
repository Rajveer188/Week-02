package assited_problem.animal_hierarchy;

//class to represent dog
public class Dog extends Animal{

    //constructer to initialize dog
    public Dog(String name, int age) {
        super(name, age);
    }

    //overriding method to make unique sound
    @Override
    protected void makeSound() {
        System.out.println("Dog is barking");
    }
}
