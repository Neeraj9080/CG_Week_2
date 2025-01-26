package inheritance.singleinheritance.smarthomedevices;

// Creating Device class to store its details
class Device
{
    // Creating attribute of the class
    String deviceId;
    String status;

    // Creating constructor of the class
    Device(String deviceId, String status)
    {
        this.deviceId = deviceId;
        this.status = status;
    }
    // Method to display details
    void displayStatus()
    {
        System.out.println("Device Id is " + deviceId);
        System.out.println("Device status is " + status);
    }
}
