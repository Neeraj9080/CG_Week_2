// Importing Scanner class for user input
import java.util.Scanner;

// creating a class Vehicle to store and display vehicle details
class Vehicle
{
    // creating instance variables of the Vehicle class
    private String ownerName;
	private final String registrationNumber;
    private String vehicleType;
    
    // creating a class variable to store the registration fee
    static double registrationFee = 2500.0;
    
    // creating Parameterized Constructor of the class
    Vehicle(String ownerName, String registrationNumber, String vehicleType)
    {
        this.ownerName = ownerName;
		this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }
    
    // Method to display vehicle details
    public void displayVehicleDetails()
    {
        System.out.println("Owner Name is " + ownerName);
        System.out.println("Vehicle Type is " + vehicleType);
		System.out.println("Registration number is " + registrationNumber);
        System.out.println("Registration Fee is " + registrationFee);
    }
    
    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee)
    {
        registrationFee = newFee;
        System.out.println("Registration Fee Updated to " + registrationFee);
    }
}

// creating Main class
class VehicleRegistrationSystem
{
    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for vehicle details
        System.out.println("Enter the owner's name ");
        String ownerName = input.nextLine();
		System.out.println("Enter the registration number ");
        String registrationNumber = input.nextLine();
        System.out.println("Enter the vehicle type (e.g., Car, Truck) ");
        String vehicleType = input.nextLine();
        
        // Creating Vehicle object and displaying details
        Vehicle vehicle1 = new Vehicle(ownerName, registrationNumber, vehicleType);
		
		// Checking vehicle1 is the object of Vehicle class
		if( vehicle1 instanceof Vehicle )
	    { 
           System.out.println("vehicle1 is the object of Vehicle class");
	    }
        
        // Updating and displaying new registration fee
        System.out.println("Enter new registration fee ");
        double newFee = input.nextDouble();
        Vehicle.updateRegistrationFee(newFee);
        
        // Displaying vehicle details again with updated registration fee
        vehicle1.displayVehicleDetails();
    }
}
