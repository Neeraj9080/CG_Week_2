package inheritance.hybridinheritance.restaurantmanagementsystem;

// Creating Chef class that extends Person and implements Worker
class Chef extends Person implements Worker
{
    // Constructor for Chef class
    Chef(String name, int id)
    {
        super(name, id);
    }

    // Implementing performDuties method
    public void performDuties()
    {
        super.displayDetails();
        System.out.println(name + " is cooking food");
    }
}