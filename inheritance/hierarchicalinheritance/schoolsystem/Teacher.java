package inheritance.hierarchicalinheritance.schoolsystem;

// Creating Teacher class that extends Person
class Teacher extends Person
{
    String subject;

    // Constructor for Teacher class
    Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }

    // Method to display teacher's role
    void displayRole()
    {
        super.displayDetails();
        System.out.println("Subject is " + subject);
    }
}