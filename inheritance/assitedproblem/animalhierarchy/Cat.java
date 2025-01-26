package inheritance.assitedproblem.animalhierarchy;

// Creating Cat class to display its sound
class Cat extends Animal
{
    // Creating constructor of the class
    Cat(String name, int age)
    {
        super(name, age);
    }

    @ Override
    void makeSound()
    {
        System.out.println("Cat sound is meow");
    }

    // Method to display details
    void displayDetails()
    {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}
