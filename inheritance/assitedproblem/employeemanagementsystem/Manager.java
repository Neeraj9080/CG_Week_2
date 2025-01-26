package inheritance.assitedproblem.employeemanagementsystem;

// Creating Manager class to store manager details
class Manager extends Employee
{
    // Creating attribute of the class
    int teamsize;

    // Creating constructor of the class
    Manager(String name, String id, double salary)
    {
        super(name, id, salary);
    }

    void getDetails(int teamsize)
    {
        this.teamsize = teamsize;
    }

    // Method to display details
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Team size is " + teamsize);
    }
}
