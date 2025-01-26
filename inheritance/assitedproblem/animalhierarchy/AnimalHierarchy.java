package inheritance.assitedproblem.animalhierarchy;

// Creating Main Class
class AnimalHierarchy
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of Dog class and calling its method
        Dog dog1 = new Dog("Husky" , 4);
        dog1.displayDetails();
        dog1.makeSound();

        // Creating object of Cat class and calling its method
        Cat cat1 = new Cat("Cat" ,2);
        cat1.displayDetails();
        cat1.makeSound();

        // Creating object of Bird class and calling its method
        Bird bird1 = new Bird("Crow" ,1);
        bird1.displayDetails();
        bird1.makeSound();
    }
}