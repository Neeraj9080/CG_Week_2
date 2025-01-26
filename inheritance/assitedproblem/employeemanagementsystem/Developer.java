package inheritance.assitedproblem.employeemanagementsystem;

// Creating Developer class to store developer details
class Developer extends Employee
{
    // Creating attribute of the class
    String programmingLanguage;

    // Creating constructor of the class
    Developer(String name, String id, double salary)
    {
        super(name, id, salary);
    }

    void getDetails(String programmingLanguage)
    {
        this.programmingLanguage = programmingLanguage;
    }

    // Method to display details
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Programming language is " + programmingLanguage);
    }
}