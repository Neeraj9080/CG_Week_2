package onlinefooddeliverysystem;

// Creating VegItem class that extends FoodItem and implements Discountable
class VegItem extends FoodItem implements Discountable
{
    // Constructor
    public VegItem(String itemName, double price, int quantity)
    {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice()
    {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount()
    {
        return calculateTotalPrice() * 0.20;
    }

    @Override
    public void getDiscountDetails()
    {
        System.out.println("20% discount applied on Veg items");
    }

    // Method to display details
    void displayDetails()
    {
        super.getItemDetails();
        System.out.println("Total price is " + calculateTotalPrice());
    }
}
