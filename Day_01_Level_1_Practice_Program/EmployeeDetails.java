// Importing Scanner class for user input
import java.util.Scanner;

// creating a class Employee to store and display employee details
class Employee
{
    // creating attribute of the Employee class
    private String employeeName;
	private String employeeID;
	private int salary;

    // creating Constructor of the class
    Employee(String employeeName, String employeeID, int salary)
    {
	     this.employeeName = employeeName;
		 this.employeeID = employeeID;
		 this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails()
    {
	     System.out.println("Employee name is " + employeeName);
		 System.out.println("Employee ID is " + employeeID);
		 System.out.println("Employee salary is " + salary);
    } 	

}

// creating Main class
class EmployeeDetails
{
    // creating Main method of the class
    public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the name of the employee ");
	   String name = input.nextLine();
	   System.out.println("Enter the id of the employee ");
	   String id = input.nextLine();
	   System.out.println("Enter the salary of the employee ");
	   int salary = input.nextInt();
	   
	   // creating object of Employee class
	   Employee object = new Employee(name,id,salary);
	   
	   // Displaying details of employee
	   System.out.println("Employee Details are ");
	   object.displayDetails();
	}
}	