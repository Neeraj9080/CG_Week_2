package onlinefooddeliverysystem;

// Creating abstract class FoodItem
abstract class FoodItem
{
    // Attribute of the class
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity)
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Getter and Setter methods for encapsulation
    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    // Concrete method to get item details
    public void getItemDetails()
    {
        System.out.println("Item Name is " + itemName);
        System.out.println("Price is " + price);
        System.out.println("Quantity is " + quantity);
    }
}