package single_inheritance.library_management;

public class Author extends Book{
    //Attribute
    private String name;
    private String bio;

    //constructor to initialize Auther
    public Author(String name, String bio, String title, int publicationYear) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    //method to show book and auther details
    public void displayInfo(){
        System.out.println("Auther name - " + name +
                "\nAuther bio - " + bio +
                "\nBook name - " + title +
                "\nPublishing year - " + publicationYear);
    }
}
