package employeemanagementsystem;

// Creating abstract Employee class to store its basic details
abstract class Employee
{
    // Attribute of the class
    private String employeeId;
    private String employeeName;
    private double baseSalary;

    Employee()
    {
        this.employeeId = "0";
        this.employeeName = "employee";
        this.baseSalary = 0.0;
    }

    // Creating constructor of the class
    Employee(String employeeId, String employeeName, double baseSalary)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    public double getBaseSalary()
    {
        return baseSalary;
    }

    // Method to display details
    public void displayDetails()
    {
        System.out.println("Employee Id is " + employeeId);
        System.out.println("Employee Name is " + employeeName);
        System.out.println("Employee base salary is "+ baseSalary);
        System.out.println("Calculated Salary is " + calculateSalary());
    }

}
