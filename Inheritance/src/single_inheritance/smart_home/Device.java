package single_inheritance.smart_home;

//super class device
public class Device{
    //Attibute
    protected int deviceId;
    protected boolean status;

    //constructor to initialize Device
    public Device(int deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}
