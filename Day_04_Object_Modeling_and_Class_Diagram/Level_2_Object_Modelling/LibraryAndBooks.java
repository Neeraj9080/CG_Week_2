// Importing ArrayList class
import java.util.ArrayList;

// Creating Book class to store and display Book details
class Book
{
    // Creating attribute of the book class
    String title;
	String author;
	
	// Creating Constructor of the class
	Book(String title,String author)
	{
	   this.title = title;
	   this.author = author;
	}
	
	// Method to display Book details
	public void displayBookDetails()
	{
	   System.out.println("Title of the book is " + title);
	   System.out.println("Author of the book is " + author);
	}
}

// Creating Library class to store list of books
class Library 
{
    ArrayList<Book> books;
    
	// Creating Constructor of the class
    Library() 
	{
        this.books = new ArrayList<>();
    }
    
	// Method to add list of books
    void addBook(Book book) 
	{
        this.books.add(book);
    }
}

// Creating Main class
class LibraryAndBooks
{
   // Creating main method
   public static void main(String[] args)
   {
        // Creating object of Book class
        Book book1 = new Book("Java" , "James Gosling");
		Book book2 = new Book("C++" , "Bjarne Stroustrup");
		Book book3 = new Book("C" , "Dennis Ritchie");
		
		// Creating object of Library class
		Library library1 = new Library();
		Library library2 = new Library();
		
		// Adding books to the libraries
		library1.addBook(book1);
		library2.addBook(book2);
		library2.addBook(book3);
		
		
		// Displaying books present in libraries
		System.out.println("Library1 books ");
        for (Book book : library1.books) 
		{
            System.out.println(book.title + " by " + book.author);
        }

        System.out.println("\nLibrary2 books");
        for (Book book : library2.books) 
		{
            System.out.println(book.title + " by " + book.author);
        }
   }
}


