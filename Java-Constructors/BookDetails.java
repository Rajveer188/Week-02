//import scanner class
import java.util.Scanner;

class Book {
    // Attribute
    private String title;
    private String author;
    private double price;

    // default constructor
    public Book() {
        // set default value
        this.title = "War and Peace";
        this.author = "Leo Tolstoy";
        this.price = 156.89;
    }

    // parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // method to display
    // method to display book details
    void displayDetails() {
        System.out.println("title -  " + title +
                "\nauthor- " + author +
                "\nprice - " + price);
    }
}

class BookDetails {
    // main method
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        Book book1 = new Book();
        System.out.println("Default book details");
        book1.displayDetails();

        System.out.println(" book details enter via user");
        // input title, author and price
        System.out.println("Enter title of book - ");
        String title = input.nextLine();

        System.out.println("Enter author of book - ");
        String author = input.nextLine();

        System.out.println("Enter price of book - ");
        double price = input.nextDouble();

        // create object of Book class
        Book book2 = new Book(title, author, price);

        // display detaiils
        book2.displayDetails();

        // close scanneer
        input.close();
    }
}