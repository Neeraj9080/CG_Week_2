package inheritance.hybridinheritance.restaurantmanagementsystem;

// Creating Person class
class Person
{
    String name;
    int id;

    // Constructor for Person class
    Person(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Method to display details
    void displayDetails()
    {
        System.out.println("Name is " + name);
        System.out.println("Id is " + id);
    }
}