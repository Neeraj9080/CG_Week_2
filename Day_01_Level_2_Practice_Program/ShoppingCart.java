// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class CartItem to store and manage shopping cart items
class CartItem
{
    // Creating attributes of the CartItem class
    private String itemName;
    private double price;
    private int quantity;
    
    // Constructor of the CartItem class
    CartItem(String itemName, double price, int quantity)
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Method to add an item to the cart
    public void addItem(int quantity)
    {
        this.quantity += quantity;
        System.out.println( quantity + " " + itemName + " added to the cart");
    }

    // Method to remove an item from the cart
    public void removeItem(int quantity)
    {
        if (this.quantity >= quantity)
        {
            this.quantity -= quantity;
            System.out.println( quantity + " " + itemName + " removeed from the cart");
        }
        else
        {
            System.out.println("Not enough " + itemName + " in the cart to remove");
        }
    }

    // Method to display the total cost of the cart
    public double calculateTotalCost()
    {
        return price * quantity;
    }
    
    // Method to display the cart item details
    public void displayItemDetails()
    {
        System.out.println("Item " + itemName);
        System.out.println("Price per item " + price);
        System.out.println("Quantity " + quantity);
    }
}

// Creating Main class
class ShoppingCart
{
    // Main method of the class
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter item name ");
        String itemName = input.nextLine();
        System.out.println("Enter item price ");
        double price = input.nextDouble();
        System.out.println("Enter quantity ");
        int quantity = input.nextInt();
        
        // Creating object of CartItem class
        CartItem item = new CartItem(itemName, price, quantity);
        
        // Adding item to cart and displaying cart details
		while(true)
		{
		System.out.println("\n 1. Add Item  \n 2. Remove Item \n 3. Display Items Details \n 4. Exit ");
		int operation = input.nextInt();
		if(operation == 4)
		{
			break;
		}	
        else
		{	
		switch(operation)
		{
		    case 1:
			  System.out.println("Enter the number of item you want to add in your cart ");
			  quantity = input.nextInt();
			  item.addItem(quantity);
			  break;
			  
			case 2:
			  System.out.println("Enter the number of item you want to remove from your cart ");
			  quantity = input.nextInt();
              item.removeItem(quantity);
              break;
            
            case 3:
              item.displayItemDetails();
              break;			

            default:
              System.out.println("Error, Invalid Selection ");
              break;			  
		}
		}
		}
		// Displaying total cost of all items
		System.out.println("Total cost " + item.calculateTotalCost());
    }
}
