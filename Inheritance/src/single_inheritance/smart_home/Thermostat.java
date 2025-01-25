package single_inheritance.smart_home;

public class Thermostat extends Device{
    //Attribute
    private float temperatureSetting;

    //constructor to initialize thermostat
    public Thermostat(int deviceId, boolean status, float temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    //method to display device status
    public void displayStatus(){
        System.out.println("Thermostat - " +
                "\nDevice id - " + deviceId +
                "\nstatus(is device on) - " + status +
                "\ntemperature setting - " + temperatureSetting);
    }

}
