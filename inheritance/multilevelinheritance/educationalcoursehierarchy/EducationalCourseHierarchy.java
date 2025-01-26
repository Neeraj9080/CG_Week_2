package inheritance.multilevelinheritance.educationalcoursehierarchy;

// Creating Main class
public class EducationalCourseHierarchy
{
    // Main Method
    public static void main(String[] args)
    {
        // Creating object of PaidOnlineCourse class and calling its method
        PaidOnlineCourse course1 = new PaidOnlineCourse("Java Programming", 12, "GFG", true, 4999, 10);
        System.out.println("Paid Online Course Details ");
        course1.displayPaidOnlineCourseDetails();
    }
}
