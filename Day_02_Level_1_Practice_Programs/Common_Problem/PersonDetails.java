// creating a class Person to store and display person details
class Person 
{
    // creating attribute of the Person class
    private String name;
    private int age;

    // creating Parameterized Constructor of the class
    public Person(String name, int age) 
	{
        this.name = name;
        this.age = age;
    }   
	
	// creating Copy Constructor of the class
    public Person(Person other) 
	{
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display details of the person
    public void displayDetails()
	{
        System.out.println("Name of the person is " + name);
		System.out.println("Age of the person is " + age);	
    }
 
}   

// creating Main class
class PersonDetails
{
    // Main method
    public static void main(String[] args) 
	{
	    // creating object of Person class and calling parameterized constructor
        Person person1 = new Person("Neeraj", 21);
		// Displaying details of person
        System.out.println("Person Details using Parameterized Constructor are ");
		person1.displayDetails();
		// creating object of Person class and calling copy constructor
		Person person2 = new Person(person1);
		// Displaying details of person
        System.out.println("Person Details using Copy Constructor are ");
		person2.displayDetails();
    }
}