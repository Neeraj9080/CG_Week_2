package ecommerceplatform;

// Creating class Clothing that extends Product and implements Taxable
class Clothing extends Product implements Taxable
{
    // Constructor
    Clothing(int productId, String name, double price)
    {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount()
    {
        // 25% discount on clothing items
        return getPrice() * 0.25;
    }

    @Override
    public double calculateTax()
    {
        // 12% tax on clothing items
        return getPrice() * 0.12;
    }

    @Override
    public void getTaxDetails()
    {
        System.out.println("12% Tax on Clothing items");
    }

    // Method to display details
    void displayDetail()
    {
        super.displayDetails();
        System.out.println("Total tax is " + calculateTax() );
        System.out.println("Total Discount is " + calculateDiscount());
    }
}
