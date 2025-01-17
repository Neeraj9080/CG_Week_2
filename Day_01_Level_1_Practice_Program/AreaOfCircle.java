// Importing Scanner class for user input
import java.util.Scanner;

// creating a class Circle to calculate area and circumference of the circle
class Circle
{
    // creating attribute of the Circle class
	private int radius;
	private double circumferenceOfCircle;
	private double areaOfCircle;
	
	// creating Constructor of the class
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
	   
	   // creating object of Circle class
	   Circle object = new Circle(radius);
	   
	   // Displaying details of circle
	   object.calculate();
	   object.displayDetails();
	}
}