package assited_problem.animal_hierarchy;
//main class to demonstrate animal hierarchy
public class AnimalMain {
    public static void main(String[] args) {
        //create object of dog, cat and bird
        Animal dog = new Dog("Crypto", 3);
        Animal cat = new Cat("heirarch", 2);
        Animal bird = new Bird("darshy", 1);

        //create overriden method to show unique behaviour
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
