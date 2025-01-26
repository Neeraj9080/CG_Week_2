package librarymanagementsystem;

// Creating Main class
class LibraryManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
        LibraryItem item1 = new Book(101, "Java", "James Gosling");
        LibraryItem item2 = new Magazine(102, "Filmfare", "Media");
        LibraryItem item3 = new DVD(103, "Avenger", "James Gunn");

        // Calling methods
        System.out.println("\nBook details are");
        item1.getItemDetails();
        item1.displayDetails();

        // Calling methods
        System.out.println("\nMagazine details are");
        item2.getItemDetails();
        item2.displayDetails();

        // Calling methods
        System.out.println("\nDVD details are");
        item3.getItemDetails();
        item3.displayDetails();
    }
}
