
//scanner import class
import java.util.Scanner;

//class to calculate and display radius of circle
class Circle {
    // Attribure
    double radius;

    // constucter to initialze objec
    Circle(double radius) {
        this.radius = radius;
    }

    // method to calculate area of circle
    double AreaOfCircle(double radius) {
        // get value of pi
        double pi = Math.PI;

        // calculate and return
        double area = pi * radius * radius;
        return area;
    }

    // method to display area
    void displayArea(double area) {
        System.out.println("with radius- " + radius + "\n area of circle is - " + area);
    }
}

class AreaOfCircle {
    //main method
    public static void main(String[] args) {
       // create object of scanner class
       Scanner input = new Scanner(System.in);

       // input name, id and salary
       System.out.println("Enter radius - ");
       double radius = input.nextDouble();

       //create object of circle class
       Circle circle = new Circle(radius);

       //get area of circle
       double area = circle.AreaOfCircle(radius);

       //display area
       circle.displayArea(area);

       //close scanner
       input.close();
    }
}
