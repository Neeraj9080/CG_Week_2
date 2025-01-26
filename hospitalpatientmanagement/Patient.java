package hospitalpatientmanagement;

// Creating abstract class Patient
abstract class Patient
{
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age)
    {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate total bill
    public abstract double calculateBill();

    // Getter and Setter methods for encapsulation
    public String getPatientId()
    {
        return patientId;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    // Method to display details
    public void getPatientDetails()
    {
        System.out.println("Patient Id is " + getPatientId());
        System.out.println("Patient Name is " + getName());
        System.out.println("Patient Age is " + getAge());
    }
}
