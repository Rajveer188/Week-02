// Program to Handle Mobile Phone Details

//scanner import class
import java.util.Scanner;

class MobilePhone {
  // Attribute
  String brand, model;
  double price;

  // Constructer to initialze object
  MobilePhone(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
  }

  // method t0 display mobile details
  void displayDetails() {
    System.out.println("mobile brand - " + brand +
        "\nmobile model - " + model +
        "\nmobile price - " + price);
  }
}

class HandleMobilePhone {
  // main method
  public static void main(String[] args) {
    // create scanner class object
    Scanner input = new Scanner(System.in);

    // int model, brand and price
    System.out.println("Enter brand of mobile-");
    String brand = input.nextLine();
    System.out.println("Enter model of mobile-");
    String model = input.nextLine();
    System.out.println("Enter price of mobile-");
    double price = input.nextDouble();

    // create object of mobile phone class
    MobilePhone mobile = new MobilePhone(brand, model, price);

    // display details
    mobile.displayDetails();

    // close scanner object
    input.close();
  }
}
