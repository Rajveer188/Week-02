
//scanner import class
import java.util.Scanner;

//class to calculate and display radius of circle
class Book {
    // Attribure
    String title, author;
    double price;

    // constucter to initialze objec
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

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

        // input title, author and price
        System.out.println("Enter title of book - ");
        String title = input.nextLine();

        System.out.println("Enter author of book - ");
        String author = input.nextLine();

        System.out.println("Enter price of book - ");
        double price = input.nextDouble();

        // create object of Book class
        Book book = new Book(title, author, price);

        // display detaiils
        book.displayDetails();

        // close scanneer
        input.close();
    }
}
