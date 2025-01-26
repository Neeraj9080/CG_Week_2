package ecommerceplatform;

// Creating class Clothing that extends Product and implements Taxable
class Electronics extends Product implements Taxable
{
    // Constructor
    Electronics(int productId, String name, double price)
    {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount()
    {
        // 15% discount on electronics items
        return getPrice() * 0.15;
    }

    @Override
    public double calculateTax()
    {
        // 18% tax on electronics items
        return getPrice() * 0.18;
    }

    @Override
    public void getTaxDetails()
    {
        System.out.println("18% Tax on Electronics items");
    }

    // Method to display details
    void displayDetail()
    {
        super.displayDetails();
        System.out.println("Total tax is " + calculateTax() );
        System.out.println("Total Discount is " + calculateDiscount());
    }
}

