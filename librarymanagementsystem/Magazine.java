package librarymanagementsystem;

// Creating class Magazine that extends LibraryItem and implements Reservable
class Magazine extends LibraryItem implements Reservable
{
    // Constructor
    public Magazine(int itemId, String title, String author)
    {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration()
    {
        // Magazine loan duration is 7 days
        return 5;
    }

    @Override
    public void reserveItem()
    {
        System.out.println("Magazine is reserved");
    }

    @Override
    public boolean checkAvailability()
    {
        return true;
    }
}