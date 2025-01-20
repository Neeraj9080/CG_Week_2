// Importing Scanner class for user input
import java.util.Scanner;

// creating a class Circle to calculate area and circumference of the circle
class Circle
{
    // creating attribute of the Circle class
	private double radius;
	private double circumferenceOfCircle;
	private double areaOfCircle;
	
	// creating Default Constructor of the class
	Circle()
	{
	   radius = 1.0 ;
	}
	
	// creating Parameterized Constructor of the class
	Circle(int radius)
	{
	   this.radius = radius;
	}
	
	// Method to Calculate area and circumference of the circle
	public void calculate()
	{
	   circumferenceOfCircle = 2 * 3.14 * radius;
	   areaOfCircle = 3.14 * radius * radius;
	}
	
	
	// Method to display area Of Circle and circumference Of Circle
    public void displayDetails()
    {
	     System.out.println("Circumference of the circle is " + circumferenceOfCircle);
		 System.out.println("Area of the circle is " + areaOfCircle);
    } 
}

// creating Main class
class AreaOfCircle
{
    // creating Main method of the class
    public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the radius of the circle ");
	   int radius = input.nextInt();
	   
	   // creating object of Circle class and calling default constructor
	   Circle circle1 = new Circle();
	   
	   // Displaying details of circle
	   System.out.println("Circle Details using Default Constructor are ");
	   circle1.calculate();
	   circle1.displayDetails();
	   
	   // creating object of Circle class and calling parameterized constructor
	   Circle circle2 = new Circle();
	   
	   // Displaying details of circle
	   System.out.println("Circle Details using Parameterized Constructor are ");
	   circle2.calculate();
	   circle2.displayDetails();
	}
}