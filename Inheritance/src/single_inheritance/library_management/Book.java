package single_inheritance.library_management;

//base class book
public class Book {
    //Attribute
    protected String title;
    protected int publicationYear;

    //constructor to initialize Book
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
