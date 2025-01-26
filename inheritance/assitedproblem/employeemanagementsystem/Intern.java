package inheritance.assitedproblem.employeemanagementsystem;

// Creating Intern class to store intern details
class Intern extends Employee
{

    // Creating constructor of the class
    Intern(String name, String id, double salary)
    {
        super(name, id, salary);
    }

    // Method to display details
    void displayDetails()
    {
        super.displayDetails();
    }
}
