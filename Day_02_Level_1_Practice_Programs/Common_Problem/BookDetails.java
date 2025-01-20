// Importing Scanner class for user input
import java.util.Scanner;

// creating a class Book to store and display book details
class Book
{
    // creating attribute of the Book class
    private String title;
	private String author;
	private double price;
	
	// creating Default Constructor of the class
	Book() 
	{
        title = "Java";
        author = "James Gosling";
        price = 100.0;
    }
	
	// creating Parameterized Constructor of the class
    Book(String title, String author, double price)
    {
	     this.title = title;
		 this.author = author;
		 this.price = price;
    }
	
	// Method to display book details
    public void displayDetails()
    {
	     System.out.println("Book title is " + title);
		 System.out.println("Book author is " + author);
		 System.out.println("Book price is " + price);
    }
}

// creating Main class
class BookDetails
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
	   double price = input.nextInt();
	   
	   // creating object of Book class and calling default constructor
	   Book book1 = new Book();
	   
	   // Displaying details of book
	   System.out.println("Book Details using Default Constructor are ");
	   book1.displayDetails();
	   
	   // creating object of Book class and calling parameterized constructor
	   Book book2 = new Book(title,author,price);
	   
	   // Displaying details of book
	   System.out.println("Book Details using Parameterized Constructor are ");
	   book2.displayDetails();
	}
}