package inheritance.hybridinheritance.restaurantmanagementsystem;

// Creating Waiter class that extends Person and implements Worker
class Waiter extends Person implements Worker
{
    // Constructor for Waiter class
    Waiter(String name, int id)
    {
        super(name, id);
    }

    // Implementing performDuties method
    public void performDuties()
    {
        super.displayDetails();
        System.out.println(name + " is serving food to customers");
    }
}