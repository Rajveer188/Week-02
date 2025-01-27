package library_management_system;

// class to represent book
class Book extends LibraryItem implements Reservable {
    //Attribute
    private boolean isAvailable;

    // constructor to initialize book
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    //override and implement abstract methods
    @Override
    public int getLoanDuration() {
        //default loan duration
        return 15;
    }
    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved successfully");
        } else {
            System.out.println("Book is not available");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
