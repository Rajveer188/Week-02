package library_management_system;

public class LibraryMain {
    public static void main(String[] args) {
        //create object of each class and store them to array
        LibraryItem[] items = {
                new Book("x009", "Java Programming", "Rajveer"),
                new Magazine("t012", "Tech Monthly", "Mr. Smith"),
                new DVD("e123", "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            //display item details
            item.getItemDetails();
            System.out.println("Loan Duration - " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Availability - " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
                reservableItem.reserveItem();
                System.out.println("Availability after reservation - " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
            }
        }
    }
}
