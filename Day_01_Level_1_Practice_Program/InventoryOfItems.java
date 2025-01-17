// Importing Scanner class for user input
import java.util.Scanner;

// creating a class Item to store and display items details and calculate the total cost
class Item
{
  // creating attribute of the Item class
    private String itemCode;
	private String itemName;
	private int price;
	private int quantity;
	
	// creating Constructor of the class
    Item(String itemCode, String itemName, int price, int quantity)
    {
	     this.itemCode = itemCode;
		 this.itemName = itemName;
		 this.price = price;
		 this.quantity = quantity;
    }
	
	// Method to calculate total cost for given quantity
	public int calculate()
	{
	   return (price*quantity);
	}
	
	// Method to display item details
    public void displayDetails()
    {
	     System.out.println("Item code is " + itemCode);
		 System.out.println("Item name is " + itemName);
		 System.out.println("Item price is " + price);
		 System.out.println("Item quantity is " + quantity);
    }
}

// creating Main class
class InventoryOfItems
{
    // creating Main method of the class
    public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the item code ");
	   String itemCode = input.nextLine();
	   System.out.println("Enter the item name ");
	   String itemName = input.nextLine();
	   System.out.println("Enter the price of the item ");
	   int price = input.nextInt();
	   System.out.println("Enter the quantity of the item ");
	   int quantity = input.nextInt();
	   
	   // creating object of Item class
	   Item object = new Item(itemCode,itemName,price,quantity);
	   
	   // Displaying details of items
	   System.out.println("Item Details are ");
	   object.displayDetails();
	   
	   // Displaying total cost for a given quantity
	   System.out.println("Total cost is " + object.calculate());
	}
}