package library_management_system;

// Abstract class to represent Library Item
abstract class LibraryItem {
    //Attribute
    private String itemId;
    private String title;
    private String author;

    // constructor to initialize library item
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters and Setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        if (itemId != null) {
            this.itemId = itemId;
        } else {
            System.out.println("Item ID cannot be null");
        }
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        } else {
            System.out.println("Title cannot be null or empty");
        }
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        } else {
            System.out.println("Author cannot be null or empty.");
        }
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    //method to get item details
    public void getItemDetails() {
        System.out.println("\nItem Id - " + itemId +
                "\nTitle - " + title +
                "\nAuthor - " + author);
    }
}


