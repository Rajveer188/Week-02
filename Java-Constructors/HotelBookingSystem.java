//import scanner object
import java.util.Scanner;

class HotelBooking {
    // Attribute
    private String guestName;
    private String roomType;
    private int nights;

    // default Construcor
    public HotelBooking() {
        this("Default_Name", "Non-AC", 1);
    }

    // copy constructor
    public HotelBooking(HotelBooking hotel) {
        this(hotel.guestName, hotel.roomType, hotel.nights);
    }

    // parameterized constructors
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // method to display details
    public void displayDetails() {
        System.out.println("Guest name - " + guestName +
                "\nroom type - " + roomType +
                "\nnights - " + nights);
        System.out.println();
    }
}

class HotelBookingSystem {
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);
        // input person name and age
        System.out.println("Enter guest name");
        String guestName = input.nextLine();

        System.out.println("Enter room-type");
        String roomType = input.nextLine();

        System.out.println("Enter nights");
        int nights = input.nextInt();

        // create object using default constructer
        HotelBooking hotel1 = new HotelBooking();
        System.out.println("Details using default constructer");
        hotel1.displayDetails();

        // create object using parameterized constructer
        HotelBooking hotel2 = new HotelBooking(guestName, roomType, nights);
        System.out.println("Details using parameterized constructer");
        hotel2.displayDetails();

        // create object using copy constructer
        HotelBooking hotel3 = new HotelBooking(hotel2);
        System.out.println("Details using copy constructer");
        hotel3.displayDetails();

        // close scanner object
        input.close();
    }
}