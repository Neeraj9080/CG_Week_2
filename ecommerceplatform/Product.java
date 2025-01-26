package ecommerceplatform;

// Creating abstract class Product
abstract class Product
{
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price)
    {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method calculateDiscount
    public abstract double calculateDiscount();

    // Getter and Setter methods for encapsulation
    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    // Method to display details
    public void displayDetails()
    {
        System.out.println("Product Id is " + productId);
        System.out.println("Product name is " + name);
        System.out.println("Product price is " + price);
    }
}