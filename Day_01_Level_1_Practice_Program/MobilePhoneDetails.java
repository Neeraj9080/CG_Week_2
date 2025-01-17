// Importing Scanner class for user input
import java.util.Scanner;

// creating a class MobilePhone to store and display Mobile Phone details
class MobilePhone
{
  // creating attribute of the MobilePhone class
    private String brand;
	private String model;
	private int price;
	
	// creating Constructor of the class
    MobilePhone(String brand, String model, int price)
    {
	     this.brand = brand;
		 this.model = model;
		 this.price = price;
    }
	
	// Method to display MobilePhone details
    public void displayDetails()
    {
	     System.out.println("Mobile Phone brand is " + brand);
		 System.out.println("Mobile Phone model is " + model);
		 System.out.println("Mobile Phone price is " + price);
    }
}

// creating Main class
class MobilePhoneDetails
{
    // creating Main method of the class
    public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the brand of the mobile phone ");
	   String brand = input.nextLine();
	   System.out.println("Enter the model of the mobile phone ");
	   String model = input.nextLine();
	   System.out.println("Enter the price of the mobile phone ");
	   int price = input.nextInt();
	   
	   // creating object of MobilePhone class
	   MobilePhone object = new MobilePhone(brand,model,price);
	   
	   // Displaying details of MobilePhone class
	   System.out.println("\n Mobile Phone Details are ");
	   object.displayDetails();
	}
}