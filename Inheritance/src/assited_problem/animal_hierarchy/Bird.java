package assited_problem.animal_hierarchy;

//class to represent dog
public class Bird extends Animal{
    //constructer to initialize bird
    public Bird(String name, int age) {
        super(name, age);
    }

    //overriding method to make unique sound
    @Override
    protected void makeSound() {
        System.out.println("bird is making sound");
    }
}
