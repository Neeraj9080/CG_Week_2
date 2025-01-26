package inheritance.multilevelinheritance.educationalcoursehierarchy;

// Creating PaidOnlineCourse class that extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse
{
    // Attributes for PaidOnlineCourse
    double fee;
    double discount;

    // Constructor for PaidOnlineCourse class
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to display paid online course details
    void displayPaidOnlineCourseDetails()
    {
        super.displayOnlineCourseDetails();
        System.out.println("Course Fee is " + fee);
        System.out.println("Discount is " + discount + "%");
    }
}
