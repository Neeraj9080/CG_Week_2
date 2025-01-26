package inheritance.assitedproblem.animalhierarchy;

// Creating Bird class to display its sound
class Bird extends Animal
{
    // Creating constructor of the class
    Bird(String name, int age)
    {
        super(name, age);
    }

    @ Override
    void makeSound()
    {
        System.out.println("Bird sound is Caw Caw");
    }

    // Method to display details
    void displayDetails()
    {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}
