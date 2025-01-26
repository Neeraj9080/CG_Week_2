package inheritance.multilevelinheritance.educationalcoursehierarchy;

// Creating OnlineCourse class that extends Course
class OnlineCourse extends Course
{
    // Attributes for OnlineCourse
    String platform;
    boolean isRecorded;

    // Constructor for OnlineCourse class
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded)
    {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Method to display online course details
    void displayOnlineCourseDetails()
    {
        super.displayCourseDetails();
        System.out.println("Platform is " + platform);
        System.out.println("Is Recorded " + (isRecorded ? "Yes" : "No"));
    }
}