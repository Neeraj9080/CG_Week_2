package inheritance.assitedproblem.animalhierarchy;

class Animal
{
    // Creating attribute of the class
    String name;
    int age;

    // Creating constructor of the class
    Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Method to display sound of Animal
    void makeSound()
    {
        System.out.println("Each animal has its own sound");
    }
}
