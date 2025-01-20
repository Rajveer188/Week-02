//import scanner class
import java.util.Scanner;

class Book {
    // Attribute
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor to initialize book details
    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        // check for book availibility
        if (available) {
            available = false;
            System.out.println(title + " Borrowed successfully");
            return true;
        } else {
            System.out.println(title + " is not available");
            return false;
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title- " + title +
                "\nAuthor- " + author +
                "\nPrice- " + price +
                "\nAvailable: " + (available ? "Yes" : "No"));
    }
}
class LibraryBookSystem{
    // Main method
    public static void main(String[] args) {
        //create object of scaner class
        Scanner input = new Scanner(System.in);
        
        //get input 
        System.out.println("enter book name");
        String title = input.nextLine();

        System.out.println("enter book author");
        String author = input.nextLine();

        System.out.println("enter book price");
        double price = input.nextDouble();

        // Create a book instance
        Book book1 = new Book(title, author, price, true);

        // Display book details
        System.out.println("\nBook Details befor Borrowing-");
        book1.displayDetails();

        // Attempt to borrow the book
        System.out.println("\nborrowing book");
        book1.borrowBook();

        // Display book details after borrowing
        System.out.println("\nBook Details After Borrowing-");
        book1.displayDetails();

       //close scanner
       input.close();
    }
}