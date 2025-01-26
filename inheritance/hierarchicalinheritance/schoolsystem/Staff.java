package inheritance.hierarchicalinheritance.schoolsystem;

// Creating Staff class that extends Person
class Staff extends Person
{
    String department;

    // Constructor for Staff class
    Staff(String name, int age, String department)
    {
        super(name, age);
        this.department = department;
    }

    // Method to display staff's role
    void displayRole()
    {
        super.displayDetails();
        System.out.println("Department is " + department);
    }
}