//import scanner class
import java.util.Scanner;

//Base Book class
class Book {
    // Attribute
    public String ISBN;
    protected String title;
    private String author;

    // constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // method to get the author name
    public String getAuthor() {
        return author;
    }

    // method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN- " + ISBN +
                "\nTitle- " + title +
                "\nAuthor- " + author);
    }
}

// Subclass EBook
class EBook extends Book {

    // constructor for EBook
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // method to display details
    public void displayEBookDetails() {
        System.out.println("ISBN- " + ISBN +
                "\nTitle- " + title);
    }

}

// main class
class LibrarySystem {
    // main method
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // input book details
        System.out.println("Enter Book ISBN-");
        String bookISBN = input.nextLine();

        System.out.println("Enter Book title-");
        String bookTitle = input.nextLine();

        System.out.println("Enter Book Author-");
        String bookAuthor = input.nextLine();

        // create a Book object
        Book book = new Book(bookISBN, bookTitle, bookAuthor);
        System.out.println("\nBook Details-");
        book.displayBookDetails();

        // update author
        System.out.println("\nEnter new author for the Book");
        String newAuthor = input.nextLine();
        book.setAuthor(newAuthor);

        System.out.println("\nUpdated Book Details-");
        book.displayBookDetails();

        // take input for EBook object
        System.out.println("\nEnter EBook ISBN-");
        String eBookISBN = input.nextLine();

        System.out.println("Enter EBook Title-");
        String eBookTitle = input.nextLine();

        System.out.println("Enter EBook Author-");
        String eBookAuthor = input.nextLine();

        // create an EBook object
        EBook eBook = new EBook(eBookISBN, eBookTitle, eBookAuthor);
        System.out.println("\nEBook Details-");
        eBook.displayEBookDetails();

        // Close the scanner
        input.close();

    }
}