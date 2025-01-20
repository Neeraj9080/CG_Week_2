// Importing Scanner class for user input
import java.util.Scanner;

// creating a class Course to store and display course details
class Course
{
    // creating instance variables of the Course class
    private String courseName;
    private int duration;
    private double fee;
    
    // creating a class variable to store the institute name
    static String instituteName = "Default Institute";
    
    // creating Parameterized Constructor of the class
    Course(String courseName, int duration, double fee)
    {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    
    // Method to display course details
    public void displayCourseDetails()
    {
        System.out.println("Course Name is " + courseName);
        System.out.println("Course Duration is " + duration + " months");
        System.out.println("Course Fee is " + fee);
        System.out.println("Institute Name is " + instituteName);
    }
    
    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName)
    {
        instituteName = newInstituteName;
        System.out.println("Institute Name Updated to " + instituteName);
    }
}

// creating Main class
class CourseDetails
{
    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for course details
        System.out.println("Enter the course name ");
        String courseName = input.nextLine();
        System.out.println("Enter the course duration (in months) ");
        int duration = input.nextInt();
        System.out.println("Enter the course fee ");
        double fee = input.nextDouble();
        
        // Creating Course object and displaying details
        Course course1 = new Course(courseName, duration, fee);
        course1.displayCourseDetails();
        
        // Updating and displaying new institute name
        System.out.println("Enter new institute name ");
        input.nextLine();  
        String newInstituteName = input.nextLine();
        Course.updateInstituteName(newInstituteName);
        
        // Displaying course details again with updated institute name
        course1.displayCourseDetails();
    }
}
