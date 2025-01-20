// Importing Scanner class for user input
import java.util.Scanner;

// creating a class Book to store and display book details
class Book
{
    // creating attributes of the Book class
    private String title;
    private String author;
    private double price;
    private boolean availability; 
    
    // creating Parameterized Constructor of the class
    Book(String title, String author, double price, boolean availability)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    
    // Method to display book details
    public void displayDetails()
    {
        System.out.println("Book title is " + title);
        System.out.println("Book author is " + author);
        System.out.println("Book price is " + price);
        System.out.println("Book availability is " + (availability ? "Available" : "Not Available"));
    }
    
    // Method to borrow a book
    public void borrowBook()
    {
	    // Check if the book is available
        if (availability)  
        {
            availability = false;  // Mark the book as borrowed (not available)
            System.out.println("You have successfully borrowed the book " + title);
        }
        else
        {
            System.out.println("Sorry, the book is currently not available");
        }
    }
}

// creating Main class
class LibraryBookingSystem
{
    // creating Main method of the class
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter the title of the book ");
        String title = input.nextLine();
        System.out.println("Enter the author of the book ");
        String author = input.nextLine();
        System.out.println("Enter the price of the book ");
        double price = input.nextDouble();
        System.out.println("Enter the availability (true for available, false for not available) ");
        boolean availability = input.nextBoolean();
                
        // creating object of Book class and calling parameterized constructor
        Book book1 = new Book(title, author, price, availability);
        
        // Displaying details of book
        System.out.println("Book Details are ");
        book1.displayDetails();
        
        // Borrowing a book
        book1.borrowBook();
    }
}
