package employeemanagementsystem;

// Creating Main class
public class EmployeeManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
        Employee employee1 = new FullTimeEmployee("101", "Rishabh", 425000, 10000.0);
        Employee employee2 = new PartTimeEmployee("102","Rajan",350000,6.0,1000.0);

        FullTimeEmployee emp1 = new FullTimeEmployee();
        emp1.assignDepartment("HR");
        PartTimeEmployee emp2 = new PartTimeEmployee();
        emp2.assignDepartment("IT");

        // Displaying employee details
        System.out.println("\nFull time employee details are ");
        employee1.displayDetails();
        emp1.getDepartmentDetails();

        System.out.println("\nPart time employee details are ");
        employee2.displayDetails();
        emp2.getDepartmentDetails();
    }
}
