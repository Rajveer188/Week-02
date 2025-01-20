//import scanner class
import java.util.Scanner;

class Book{
    //Attribute
    private String title;
    private String auther;
    private final String ISBN;

   static String libraryName = "Vedansh Library";

    //constructer to initialize objecrt
    public Book(String title, String auther, String ISBN) {
        this.title = title;
        this.auther = auther;
        this.ISBN = ISBN;
    }
    //static method to print the library name
    public static void displayLibraryName(){
        System.out.println("Library name - " + libraryName);
    }
    //method to display details of book
    public void displayDetails(){
        System.out.println("Title - " + title +
                "\nAuther - "  + auther +
                "\nISBN - " + ISBN);
    }
}

class LibraryManagement {
    //main method
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //get input
        System.out.println("enter book title - ");
        String title = input.nextLine();
        System.out.println("Enter book auther - ");
        String auther = input.nextLine();
        System.out.println("Enter ISBN number - ");
        String ISBN = input.nextLine();

        //call method to display library name
        Book.displayLibraryName();

        //create object of Book claas
        Book book = new Book(title, auther, ISBN);

        //Check if an book object is an instance of the book
        if(book instanceof Book){
            book.displayDetails();
        }
        //close scanner object
        input.close();
    }
}
