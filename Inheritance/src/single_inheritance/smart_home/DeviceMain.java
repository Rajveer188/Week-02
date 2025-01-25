package single_inheritance.smart_home;

public class DeviceMain{
    public static void main(String[] args) {
        //create thermostat object
        Thermostat thermostat = new Thermostat(101, true, 21);
        thermostat.displayStatus();
    }
}
