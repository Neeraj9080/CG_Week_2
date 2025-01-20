// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Employee to store and manage employee details
class Employee
{
    // Instance variables with different access modifiers
    public final String employeeID;
    protected String designation;
    private double salary;
    
	// Creating class variables
	static String companyName;
	static int totalNumberOfEmployee = 0;
	
	// Default Constructor of the class
	Employee()
	{
		employeeID = "";
	}
	
    // Constructor to initialize employee details
    Employee(String companyName, String employeeID, String designation, double salary)
    {
		totalNumberOfEmployee++;
		
		this.companyName = companyName;
        this.employeeID = employeeID;
        this.designation = designation;
        this.salary = salary;
    }
    
    // Public method to modify salary
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    // Public method to access salary
    public double getSalary()
    {
        return salary;
    }
	public static void displayTotalEmployees()
	{
		System.out.println("Total Number Of Employees is " + totalNumberOfEmployee);
	}
}

// Creating a subclass Manager to demonstrate access to employeeID and department
class Manager extends Employee
{
    // Constructor to initialize manager details
    Manager(String companyName, String employeeID, String designation, double salary)
    {
        super(companyName, employeeID, designation, salary);
    }
    
    // Method to display manager details
    public void displayDetails()
    {
        System.out.println("Employee ID is " + employeeID);
        System.out.println("Designation is " + designation);
        System.out.println("Salary is " + getSalary());
    }
}

// Creating Main class
class EmployeeRecordsSystem
{
    // Main method
    public static void main(String[] args)
    {
	   Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the company name ");
	   String companyName = input.nextLine();
	   System.out.println("Enter the employee ID ");
	   String employeeID = input.nextLine();
	   System.out.println("Enter the designation of the employee ");
	   String designation = input.nextLine();
	   System.out.println("Enter the salary of the employee ");
	   double salary = input.nextDouble();
	   
	   // Creating a Employee object
	   Employee employee = new Employee();
	   
	   // checking employee is object of Employee class or not
	   if( employee instanceof Employee )
	   { 
             System.out.println("employee is the object of Employee class");
	   }
	   
        // Creating a Manager object
        Manager manager = new Manager(companyName, employeeID, designation, salary);
        manager.displayDetails();
        
        // Modifying and displaying salary using public method
		System.out.println("Enter the updated salary of the employee  "); 
        salary = input.nextDouble();
        manager.setSalary(salary);
        System.out.println("Updated Salary is " + manager.getSalary());
    }
}
