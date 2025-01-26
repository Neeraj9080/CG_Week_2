package librarymanagementsystem;

// Creating class Book that extends LibraryItem and implements Reservable
class Book extends LibraryItem implements Reservable
{
    public Book(int itemId, String title, String author)
    {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration()
    {
        return 30;
    }

    @Override
    public void reserveItem()
    {
        System.out.println("Book is reserved");
    }

    @Override
    public boolean checkAvailability()
    {
        return false;
    }
}
