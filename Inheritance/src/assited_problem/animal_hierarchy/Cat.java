package assited_problem.animal_hierarchy;

public class Cat extends Animal{

    //constructer to initialize cat
    public Cat(String name, int age) {
        super(name, age);
    }
    //overriding method to make unique sound
    @Override
    protected void makeSound() {
        System.out.println("Cat is making sound: meaoo");
    }
}
