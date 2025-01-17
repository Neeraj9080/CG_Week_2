// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Student to store and display student details
class Student
{
    // Creating attributes of the Student class
    private String name;
    private int rollNumber;
    private int marks;
    
    // Constructor of the Student class
    Student(String name, int rollNumber, int marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    // Method to calculate the grade based on marks
    public String calculateGrade()
    {
        if (marks >= 80) 
		return "A";
		
        else if (marks >= 70)
		return "B";
		
        else if (marks >= 50) 
		return "C";
		
        else 
		return "D";
    }

    // Method to display student details and grade
    public void displayDetails()
    {
        System.out.println("Student name is " + name);
        System.out.println("Student roll number is " + rollNumber);
        System.out.println("Student Marks is " + marks);
        System.out.println("Student Grade is " + calculateGrade());
    }
}

// Creating Main class
class StudentReport
{
    // Main method of the class
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter the student's name ");
        String name = input.nextLine();
        System.out.println("Enter the roll number ");
        int rollNumber = input.nextInt();
        System.out.println("Enter the marks ");
        int marks = input.nextInt();
        
        // Creating object of Student class
        Student student = new Student(name, rollNumber, marks);
        
        // Displaying student details and grade
        System.out.println("Student Details ");
        student.displayDetails();
    }
}
