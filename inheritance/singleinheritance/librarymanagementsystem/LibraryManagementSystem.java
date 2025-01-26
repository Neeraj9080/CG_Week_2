package inheritance.singleinheritance.librarymanagementsystem;

// Creating Main Class
public class LibraryManagementSystem
{
    // Main Method
    public static void main(String[] args)
    {
        // Creating object of Author class and calling its method
        Author author1 = new Author("Java", 2005);
        author1.setDetails("James Gosling", "Programming Language Book");
        author1.displayInfo();
    }
}
