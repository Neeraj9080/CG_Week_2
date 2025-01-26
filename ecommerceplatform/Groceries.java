package ecommerceplatform;

// Creating class Groceries that extends Product and implements Taxable
class Groceries extends Product implements Taxable
{
    // Constructor
    Groceries(int productId, String name, double price)
    {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount()
    {
        // 10% discount on groceries item
        return getPrice() * 0.1 ;
    }

    @Override
    public double calculateTax()
    {
        // 5% tax on groceries items
        return getPrice() * 0.05;
    }

    @Override
    public void getTaxDetails()
    {
        System.out.println("5% Tax on Groceries items");
    }

    // Method to display details
    void displayDetail()
    {
        super.displayDetails();
        System.out.println("Total tax is " + calculateTax() );
        System.out.println("Total Discount is " + calculateDiscount());
    }
}