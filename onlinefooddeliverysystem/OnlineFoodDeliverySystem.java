package onlinefooddeliverysystem;

// Creating Main class
class OnlineFoodDeliverySystem
{
    // Main method
    public static void main(String[] args)
    {
        VegItem item1 = new VegItem("Panner Tikka", 250, 5);
        NonVegItem item2 = new NonVegItem("Chicken Biryani", 500, 2);

        System.out.println("\nVeg Item details are ");
        item1.displayDetails();

        System.out.println("\nNon-Item details are ");
        item2.displayDetails();
    }
}