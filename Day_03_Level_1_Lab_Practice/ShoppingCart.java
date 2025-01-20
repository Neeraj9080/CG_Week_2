// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Product to store and manage shopping cart items
class Product
{
    // Creating attributes of the Product class
	final String productID;
    private String productName;
    private double price;
    private int quantity;
	static double discount;
	
	// Default Constructor of the Product class
    Product()
    {
		productID = "abc123";
		discount = 5.0;
    }		
    
    // Constructor of the Product class
    Product(String productID, String productName, double price, int quantity)
    {
		this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Method to modify discount percentage
	public static void updateDiscount(double discount)
	{
		Product.discount = discount;
	}

    // Method to display the total cost of the cart
    public double calculateTotalCost()
    {
        return price * quantity;
    }
    
    // Method to display the cart item details
    public void displayProductDetails()
    {
		System.out.println("Product ID is " + productID);
        System.out.println("Product name is " + productName);
        System.out.println("Price per item is " + price);
        System.out.println("Quantity is " + quantity);
		System.out.println("Discount is " + discount);
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
		System.out.println("Enter product ID ");
        String productID = input.nextLine();
        System.out.println("Enter product name ");
        String productName = input.nextLine();
        System.out.println("Enter price one product");
        double price = input.nextDouble();
        System.out.println("Enter quantity of product ");
        int quantity = input.nextInt();
        
        // Creating object of Product class
        Product product = new Product(productID, productName, price, quantity);
        
        // checking product is object of Product class or not
	   if( product instanceof Product )
	   { 
             System.out.println("product is the object of Product class");
	   }
	   
	   // Modifying and displaying discount using static method
		System.out.println("Enter the updated discount of the product  "); 
        double discount = input.nextDouble();
        product.updateDiscount(discount);
        System.out.println("Updated Discount percentage is " + discount);
		
		// Displaying total cost and details of product
		product.displayProductDetails();
		System.out.println("Total cost is " + product.calculateTotalCost());
    }
}
