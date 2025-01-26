package inheritance.multilevelinheritance.educationalcoursehierarchy;

// Creating Course class to store course details
class Course
{
    // Attributes of the Course class
    String courseName;
    int duration;

    // Constructor for Course class
    Course(String courseName, int duration)
    {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    void displayCourseDetails()
    {
        System.out.println("Course Name is " + courseName);
        System.out.println("Course Duration is " + duration + " weeks");
    }
}
