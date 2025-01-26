package librarymanagementsystem;

// Creating abstract class LibraryItem
abstract class LibraryItem
{
    // Attribute of the class
    private int itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(int itemId, String title, String author)
    {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    // Concrete method for getting item details
    public void getItemDetails()
    {
        System.out.println("Item Id is " + itemId);
        System.out.println("Title is " + title);
        System.out.println("Author is " + author);
    }

    // Getter and Setter methods for encapsulation
    public int getItemId()
    {
        return itemId;
    }

    public void setItemId(int itemId)
    {
        this.itemId = itemId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void displayDetails()
    {
        System.out.println("Loan Duration is " + getLoanDuration());
        System.out.println("Item id is " + getItemId());
    }
}
