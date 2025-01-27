package library_management_system;

// class to represent magazine
class Magazine extends LibraryItem implements Reservable {
    //Attribute
    private boolean isAvailable;

    // constructor to initialize magazine
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    //override and implement abstract methods
    @Override
    public int getLoanDuration() {
        return 7; // Loan duration
    }
    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved successfully");
        } else {
            System.out.println("Magazine is not available");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}