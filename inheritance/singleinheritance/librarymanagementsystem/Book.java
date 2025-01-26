package inheritance.singleinheritance.librarymanagementsystem;

// Creating Book class to store its details
class Book
{
    // Creating attribute of the class
    String title;
    int publicationYear;

    // Creating constructor of the class
    Book(String title, int publicationYear)
    {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display details
    void displayInfo()
    {
        System.out.println("Title of the Book is " + title);
        System.out.println("Publication Year is "+ publicationYear);
    }
}