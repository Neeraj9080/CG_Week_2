package inheritance.hierarchicalinheritance.schoolsystem;

// Creating Student class that extends Person
class Student extends Person
{
    String grade;

    // Constructor for Student class
    Student(String name, int age, String grade)
    {
        super(name, age);
        this.grade = grade;
    }

    // Method to display student's role
    void displayRole()
    {
        super.displayDetails();
        System.out.println("Grade is " + grade);
    }
}
