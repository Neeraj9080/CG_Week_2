// Importing Scanner class for user input
import java.util.Scanner;

// creating a class Product to store and display product details
class Product
{
    // creating instance variables of the Product class
    private String productName;
    private double price;
    
    // creating a class variable to keep track of the total number of products created
    static int totalProducts = 0;
    
    // creating Parameterized Constructor of the class
    Product(String productName, double price)
    {
        this.productName = productName;
        this.price = price;
        totalProducts++;  
    }
    
    // Method to display product details
    public void displayProductDetails()
    {
        System.out.println("Product Name is " + productName);
        System.out.println("Product Price is " + price);
    }
    
    // Class method to display the total number of products created
    public static void displayTotalProducts()
    {
        System.out.println("Total Products Created is " + totalProducts);
    }
}

// creating Main class
class ProductDetails
{
    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for product details
        System.out.println("Enter the product name ");
        String productName = input.nextLine();
        System.out.println("Enter the product price ");
        double price = input.nextDouble();
        
        // Creating Product object and displaying details
        Product product1 = new Product(productName, price);
        product1.displayProductDetails();
        
        // Displaying total products created
        Product.displayTotalProducts();
    }
}
