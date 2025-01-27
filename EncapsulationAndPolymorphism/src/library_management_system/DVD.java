package library_management_system;

// class to represent DVD
class DVD extends LibraryItem implements Reservable {
    //Attribute
    private boolean isAvailable;

    // constructor to initialize Dvd
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    //override and implement abstract methods
    @Override
    public int getLoanDuration() {
        return 4; // Loan duration
    }
    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved successfully");
        } else {
            System.out.println("DVD is not available");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
