package inheritance.singleinheritance.smarthomedevices;

// Creating Thermostat class to store its details
class Thermostat extends Device
{
    // Creating attribute of the class
    String temperatureSetting;

    // Creating constructor of the class
    Thermostat(String deviceId, String status)
    {
        super(deviceId, status);
    }

    // Method to set the temperature setting
    void setTemperatureSetting(String temperatureSetting)
    {
        this.temperatureSetting = temperatureSetting;
    }

    // Method to display details
    void displayStatus()
    {
        super.displayStatus();
        System.out.println("Temperature Setting is " + temperatureSetting);
    }
}
