package inheritance.hybridinheritance.restaurantmanagementsystem;

// Creating Main class
public class RestaurantManagementSystem
{
    // Creating Main method
    public static void main(String[] args)
    {
        // Creating objects of classes
        Chef chef1 = new Chef("Abhishek", 101);
        System.out.println("\nChef details are ");
        chef1.performDuties();

        Waiter waiter1 = new Waiter("Rajan", 102);
        System.out.println("\nWaiter details are ");
        waiter1.performDuties();
    }
}
