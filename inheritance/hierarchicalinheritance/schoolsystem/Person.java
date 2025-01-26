package inheritance.hierarchicalinheritance.schoolsystem;

// Creating Person class with common attributes
class Person
{
    String name;
    int age;

    // Constructor for Person class
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Method to display common details
    void displayDetails()
    {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}