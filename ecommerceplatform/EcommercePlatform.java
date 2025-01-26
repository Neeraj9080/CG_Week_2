package ecommerceplatform;

// Creating Main class
class ECommercePlatform
{
    // Main method
    public static void main(String[] args)
    {
        Electronics electronics1 = new Electronics(101, "Laptop", 50000);
        Clothing clothing1 = new Clothing(102, "Shirt", 1000);
        Groceries groceries1 = new Groceries(103, "Dettol",100 );

        // Callings electronics methods
        System.out.println("\nElectronics details are ");
        electronics1.displayDetails();
        electronics1.getTaxDetails();

        // Callings clothing's methods
        System.out.println("\nClothing details are ");
        clothing1.displayDetail();
        clothing1.getTaxDetails();

        // Callings groceries methods
        System.out.println("\nGroceries details are ");
        groceries1.displayDetail();
        groceries1.getTaxDetails();
    }
}