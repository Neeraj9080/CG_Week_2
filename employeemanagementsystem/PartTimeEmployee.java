package employeemanagementsystem;

// Creating PartTimeEmployee class that extends Employee class and implements Department class
class PartTimeEmployee extends Employee implements Department
{
    // Attribute of the class
    private double workHours;
    private double salaryPerHours;
    private String department;

    // Default constructor of the class
    PartTimeEmployee()
    {
        this.department = " ";
    }

    // Creating constructor of the class
    PartTimeEmployee(String employeeId, String employeeName, double baseSalary, double workHours, double salaryPerHours)
    {
        super(employeeId, employeeName, baseSalary);
        this.workHours = workHours;
        this.salaryPerHours = salaryPerHours;
    }

    @Override
    public void assignDepartment(String department)
    {
        this.department = department;
    }

    @Override
    public void getDepartmentDetails()
    {
        System.out.println("Part time employee's department is " + department);
    }

    @Override
    public double calculateSalary()
    {
        return (getBaseSalary() +  (workHours * salaryPerHours));
    }
}
