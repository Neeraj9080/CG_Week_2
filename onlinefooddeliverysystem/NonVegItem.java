package onlinefooddeliverysystem;

// Creating NonVegItem class that extends FoodItem and implements Discountable
class NonVegItem extends FoodItem implements Discountable
{
    // Constructor
    public NonVegItem(String itemName, double price, int quantity)
    {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice()
    {
        // 100 is additional charge on non-veg food
        return getPrice() * getQuantity() + 100;
    }

    @Override
    public double applyDiscount()
    {
        return calculateTotalPrice() * 0.27;
    }

    @Override
    public void getDiscountDetails()
    {
        System.out.println("27% discount applied on Non-Veg items");
    }

    // Method to display details
    void displayDetails()
    {
        super.getItemDetails();
        System.out.println("Total price is " + calculateTotalPrice());
    }
}
