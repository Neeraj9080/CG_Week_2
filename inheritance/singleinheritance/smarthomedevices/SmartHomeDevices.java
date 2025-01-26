package inheritance.singleinheritance.smarthomedevices;

// Creating Main class
public class SmartHomeDevices
{
    // Main Method
    public static void  main(String[] args)
    {
        // Creating object of Thermostat class and calling its method
        Thermostat thermostat1 = new Thermostat("103","ON");
        thermostat1.setTemperatureSetting("High");
        thermostat1.displayStatus();
    }
}