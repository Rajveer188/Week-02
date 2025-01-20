//import scanner class
import java.util.Scanner;

class Circle {
    // Attribute
    private double radius;

    // Default constructor
    public Circle() {
        // call another constructer for constructer chaining
        this(1);
    }

    // Parameterized constructer
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    private double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    // Method to display circle details
    public void displayDetails() {
        // get area
        double area = calculateArea();
        System.out.println("Radius- " + radius + "\nArea- " + area);
    }
}

public class CircleDetails {
    public static void main(String[] args) {
        // using default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Constructor Circle");
        defaultCircle.displayDetails();

        // create object of scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("\nParameterized Constructor Circle:");

        System.out.println("Enter the radius");
        double radius = input.nextDouble();

        // Using parameterized constructor
        Circle customCircle = new Circle(radius);
        System.out.println("\nParameterized Constructor Circle:");
        customCircle.displayDetails();

        // close scanner
        input.close();
    }
}