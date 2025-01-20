// Importing Scanner class for user input
import java.util.Scanner;

// creating a class CarRental to calculate total cost and details of the rental car
class CarRental
{
    // creating attribute of the CarRental class
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int totalCost;
    
	// creating Parameterized Constructor of the class
    CarRental(String customerName, String carModel, int rentalDays)
    {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    
	// Method to calculate total cost of rental car
    void calculateTotalCost()
    {
        if (carModel.equals("Hatchback"))
        {
            totalCost = rentalDays * 2000;
        }
        else if (carModel.equals("Sedan"))
        {
            totalCost = rentalDays * 3000;
        }
        else if (carModel.equals("SUV"))
        {
            totalCost = rentalDays * 4000;
        }
    }
    
	// Method to display details of the rental car
    void displayDetails()
    {
        System.out.println("Customer Name is " + customerName);
        System.out.println("Car Model is " + carModel);
        System.out.println("Rental Days is " + rentalDays);
        System.out.println("Total Cost is " + totalCost);
    }
}

// creating Main Class
class CarRentalSystem
{
    // Main method
    public static void main(String[] args)
    {
	    Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter the customer name ");
        String customerName = input.nextLine();
        System.out.println("Enter the model of the car (in Hatchback, Sedan and SUV ) ");
        String carModel = input.nextLine();
        System.out.println("Enter the rental days of the car ");
        int rentalDays = input.nextInt();
	    
        CarRental carRental = new CarRental(customerName,carModel,rentalDays);
        carRental.calculateTotalCost();
        carRental.displayDetails();
    }
}