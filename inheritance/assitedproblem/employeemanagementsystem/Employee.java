package inheritance.assitedproblem.employeemanagementsystem;

// Creating Employee class to store basic employee details
class Employee
{
    // Creating attribute of the class
    String name;
    String id;
    double salary;

    // Creating constructor of the class
    Employee(String name, String id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    void displayDetails()
    {
        System.out.println("Employee name is " + name);
        System.out.println("Employee ID is " + id);
        System.out.println("Employee salary is " + salary);
    }
}
