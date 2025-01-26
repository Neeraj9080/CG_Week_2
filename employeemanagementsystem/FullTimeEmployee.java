package employeemanagementsystem;

// Creating FullTimeEmployee class that extends Employee class and implements Department class
class FullTimeEmployee extends Employee implements Department
{
    // Attribute of the class
    private double bonus;
    private String department;

    // Default constructor of the class
    FullTimeEmployee()
    {
        this.department = " ";
    }

    // Creating constructor of the class
    FullTimeEmployee(String employeeId, String employeeName, double baseSalary, double bonus)
    {
        super(employeeId, employeeName, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public void assignDepartment(String department)
    {
         this.department = department;
    }

    @Override
    public void getDepartmentDetails()
    {
        System.out.println("Full time Employee's department is " + department);
    }

    @Override
    public double calculateSalary()
    {
        return (getBaseSalary()  + bonus );
    }
}
