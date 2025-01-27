package ride_hailing_application;

public interface GPS {
    //Abstract method
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
