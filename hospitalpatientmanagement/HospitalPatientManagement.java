package hospitalpatientmanagement;

// Creating Main class
class HospitalManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
        Patient inPatient = new InPatient("101", "Rajan", 21, 2700, 3);
        Patient outPatient = new OutPatient("102", "Sachin", 23, 4500);

        System.out.println("\nInPatient details are ");
        inPatient.getPatientDetails();
        System.out.println("InPatient Bill is " + inPatient.calculateBill());

        System.out.println("\nOutPatient details are ");
        outPatient.getPatientDetails();
        System.out.println("OutPatient Bill is " + outPatient.calculateBill());
    }
}
