package librarymanagementsystem;

// Creating class DVD that extends LibraryItem and implements Reservable
class DVD extends LibraryItem implements Reservable
{
    // Constructor
    public DVD(int itemId, String title, String author)
    {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration()
    {
        return 1;
    }

    @Override
    public void reserveItem()
    {
        System.out.println("DVD is reserved");
    }

    @Override
    public boolean checkAvailability()
    {
        return true;
    }
}