package inheritance.hierarchicalinheritance.schoolsystem;

// Creating Main class
public class SchoolSystem
{
    // Main method
    public static void main(String[] args)
    {
        // Creating objects of classes
        Teacher teacher1 = new Teacher("Mr. Neeraj", 20, "Mathematics");
        System.out.println("\nTeacher details are ");
        teacher1.displayRole();

        Student student1 = new Student("Abhishek", 16, "10th Grade");
        System.out.println("\nStudent details are ");
        student1.displayRole();

        Staff staff1 = new Staff("Rajan", 25, "Sweeper");
        System.out.println("\nStaff details are ");
        staff1.displayRole();
    }
}
