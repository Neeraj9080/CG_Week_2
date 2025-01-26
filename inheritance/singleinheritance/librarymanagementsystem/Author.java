package inheritance.singleinheritance.librarymanagementsystem;

// Creating Author class to store its details
class Author extends Book
{
    // Creating attribute of the class
    String authorName;
    String authorBio;

    // Creating constructor of the class
    Author(String title, int publicationYear)
    {
        super(title,publicationYear);
    }

    // Method to set the details of the author
    void setDetails(String authorName, String authorBio)
    {
        this.authorName = authorName;
        this.authorBio = authorBio;
    }

    // Method to display details
    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Author Name is " + authorName);
        System.out.println("Author Bio is " + authorBio);
    }
}
