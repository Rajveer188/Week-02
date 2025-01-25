package single_inheritance.library_management;

//class to demonstrate all operations
public class Library {
    public static void main(String[] args) {
        //details of book and auther
        String autherName = "Kiran Desai";
        String autherBio = "Kiran Desai is an Indian author";
        String bookTitle = "The Inheritance of Loss";
        int publicationYear = 2006;

        //create object of auther class
        Author author = new Author(autherName,autherBio,bookTitle, publicationYear);
        //call method to display information
        author.displayInfo();
    }
}
