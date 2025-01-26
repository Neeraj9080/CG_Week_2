package inheritance.assitedproblem.animalhierarchy;

// Creating Dog class to display its sound
class Dog extends Animal
{
    // Creating constructor of the class
    Dog(String name, int age)
    {
        super(name, age);
    }

    @ Override
    void makeSound()
    {
        System.out.println("Dog is Barking");
    }

    // Method to display details
    void displayDetails()
    {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}
