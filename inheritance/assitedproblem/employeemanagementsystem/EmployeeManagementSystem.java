package inheritance.assitedproblem.employeemanagementsystem;

// Creating Main Class
class EmployeeManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of Manager class and calling its method
        Manager manager1 = new Manager("Neeraj","103",500000);
        manager1.getDetails(10);
        System.out.println("\nManager details are ");
        manager1.displayDetails();

        // Creating object of Developer class and calling its method
        Developer developer1 = new Developer("Rajan","127",450000);
        developer1.getDetails("Java");
        System.out.println("\nDeveloper details are ");
        developer1.displayDetails();

        // Creating object of Intern class and calling its method
        Intern intern1 = new Intern("Abhishek" , "015", 425000 );
        System.out.println("\nIntern details are ");
        intern1.displayDetails();
    }
}
