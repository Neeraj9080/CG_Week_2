// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Book to store and manage book details
class Book
{
    // Instance variables
    final String ISBN;
    String title;
    String author;
	
	// creating class variables
	static String libraryName;
	
    // Constructor to initialize book details
    Book(String ISBN, String title, String author)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
	
	// creating class method to get libraryName
	public static void displayLibraryName(String library_Name)
	{
		libraryName = library_Name;
		System.out.println("Library Name is " + libraryName);
	}
	
	// Method to display Book details
    public void displayLibraryDetails()
    {
        System.out.println("ISBN Number is " + ISBN);
        System.out.println("Title of book is " + title);
        System.out.println("Author of the book is " + author);
    }
}


// Creating Main class
class LibraryManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
	   Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the library Name ");
	   String library_Name = input.nextLine();
	   System.out.println("Enter the ISBN number of the book ");
	   String isbnNumber = input.nextLine();
	   System.out.println("Enter the title of the book ");
	   String title = input.nextLine();
	   System.out.println("Enter the author of the book ");
	   String author = input.nextLine();
	   
	   // Creating object of book class
	   Book book1 = new Book(isbnNumber,title,author);
	   if(book1 instanceof Book)
	   {
		   System.out.println("book1 is the object of Book class");
       }
	   
	   // Displaying library name and library details
       book1.displayLibraryName(library_Name);		
       book1.displayLibraryDetails();
    }
}
