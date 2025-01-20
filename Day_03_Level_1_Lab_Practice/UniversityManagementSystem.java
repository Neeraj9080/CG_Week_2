// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Student to store and manage student details
class Student
{
    // Instance variables with different access modifiers
    static String universityName = "abc university";
	public final String rollNumber;
    protected String name;
    public char grade;
	static int totalNumberOfStudents = 0;
    
    // Constructor to initialize the student details
    Student(String rollNumber, String name, char grade)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
		
		totalNumberOfStudents++;
    }
	
	// Method to modify grades of the student
	public void updateGrades(char grade)
	{
		this.grade = grade;
	}
	
	// Method to display student details
    public void displayDetails()
    {
		System.out.println("University name is " + universityName);
        System.out.println("Roll Number is " + rollNumber);
        System.out.println("Name is " + name);
        System.out.println("Grade is " + grade);
    }
	
	// Method to display total number of student
    public static void displayTotalStudents()
    {
		System.out.println("Total number of student is " + totalNumberOfStudents );
	}
}



// Creating Main class
class UniversityManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
	     Scanner input = new Scanner(System.in);
        
        // Taking user input for course details
        System.out.println("Enter the rollNumber of the  student ");
        String studentRollNumber = input.nextLine();
        System.out.println("Enter the name of the student ");
        String studentName = input.nextLine();
        System.out.println("Enter the grade of the student ");
        char grade = input.next().charAt(0);
	
        // Creating a Student object
        Student student = new Student(studentRollNumber,studentName,grade);
		// Checking student is the object of Student class
		if( student instanceof Student )
	    { 
           System.out.println("student is the object of Student class");
	    }
        student.displayDetails();
        
        // Modifying grade using public method
        System.out.println("Enter the new grade of the student "); 
        grade = input.next().charAt(0);
        student.updateGrades(grade);
        System.out.println("Updated grade is " + student.grade);
		student.displayTotalStudents();
    }
}
