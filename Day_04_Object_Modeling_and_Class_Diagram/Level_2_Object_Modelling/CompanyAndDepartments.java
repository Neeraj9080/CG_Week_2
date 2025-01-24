// Importing ArrayList class
import java.util.ArrayList;

// Creating Employee class to store employee details
class Employee 
{
    // Creating attributes of the employee class
    String employeeName;
    int employeeId;

    // Creating Constructor of the class
    Employee(String employeeName, int employeeId) 
	{
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    // Method to display employee details
    public void displayEmployeeDetails() 
	{
        System.out.println("Employee ID is " + employeeId);
		System.out.println("Employee name is " + employeeName);
    }
}

// Creating Department class to store Employee details
class Department 
{
    // Creating attribute to store list of employees in a department
    String departmentName;
    ArrayList<Employee> employees;

    // Creating Constructor of the class
    Department(String departmentName) 
	{
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) 
	{
        employees.add(employee);
    }

    // Method to display department and employee details
    public void displayDepartmentDetails() 
	{
        System.out.println("Department name is " + departmentName);
        for (Employee employee : employees) 
		{
            employee.displayEmployeeDetails();
        }
    }
}

// Creating Company class to store Department details
class Company 
{
    // Creating attribute to store list of departments in the company
    String companyName;
    ArrayList<Department> departments;

    // Creating Constructor of the class
    Company(String companyName) 
	{
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) 
	{
        departments.add(department);
    }

    // Method to display company, department, and employee details
    public void displayCompanyDetails() 
	{
        System.out.println("Company name is " + companyName);
        for (Department department : departments) 
		{
            department.displayDepartmentDetails();
        }
    }

    // Method to delete company and all associated departments and employees
    public void deleteCompany() 
	{
        departments.clear();
        System.out.println("Company and all associated departments and employees have been deleted.");
    }
}

// Creating Main class
class CompanyAndDepartments 
{
    // Creating main method
    public static void main(String[] args) 
	{
        // Creating object of Company class
        Company company = new Company("Capgemini");

        // Creating department objects
        Department department1 = new Department("Development");
        Department department2 = new Department("HR");

        // Creating employee objects
        Employee employee1 = new Employee("Rajan", 001);
        Employee employee2 = new Employee("Sachin", 002);
        Employee employee3 = new Employee("Abhishek", 003);

        // Adding employees to departments
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);

        // Adding departments to the company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Displaying company details
        company.displayCompanyDetails();

        // Deleting the company and associated departments and employees
        company.deleteCompany();
    }
}
