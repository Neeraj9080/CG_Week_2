// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Patient to store and display Patient details
class Patient
{
      // Creating attribute of the patient class
	  static String hospitalName;
	  static int totalNumberOfPatients = 0;
	  final String patientID ;
	  String patientName;
	  int patientAge;
	  String patientAilment;
	  
	  // Constructor to initialize the patient details
	  Patient( String patientName, int patientAge, String patientAilment, String patientID)
	  {
	       this.patientName = patientName;
		   this.patientAge = patientAge ;
		   this.patientAilment = patientAilment;
		   this.patientID = patientID;
		   
		   totalNumberOfPatients++;
	  }
	  
	  // Method to store patient details
	  public void setPatientsDetails(String hospitalName)
	  {
	       Patient.hospitalName = hospitalName;
	  }
	  
	// Method to display student details
    public void displayPatientsDetails()
    {
	    System.out.println("Hospial name is " + hospitalName);
		System.out.println("Patient ID is " + patientID);
        System.out.println("Patient name is " + patientName);
        System.out.println("Patient Age is " + patientAge);
        System.out.println("Patient Ailment is " + patientAilment);
    }
	
	// Method to display total number of patients
    public static void getTotalPatients()
    {
	    System.out.println("Total number of patient is " + totalNumberOfPatients );
	}	
	  
}

// Creating Main class
class HospitalManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
	    Scanner input = new Scanner(System.in);
        
        // Taking user input for course details
        System.out.println("Enter the hospital name ");
        String hospitalName = input.nextLine();
        System.out.println("Enter the patient ID ");
        String patientID = input.nextLine();
        System.out.println("Enter the name of the patient ");
        String patientName = input.nextLine();
		System.out.println("Enter the age of the patient ");
        int patientAge = input.nextInt();
		input.nextLine();
		System.out.println("Enter the ailment of the patient ");
        String patientAilment = input.nextLine();
		
		// Creating Patient class object and storing patient details
        Patient patient1 = new Patient(patientName, patientAge, patientAilment, patientID);
		patient1.setPatientsDetails(hospitalName);
		
		// Checking patient1 is the object of Patient class
		if( patient1 instanceof Patient )
	    { 
           System.out.println("patient1 is the object of Patient class");
	    }
			
		// Displaying patient details and total number of Patients
		patient1.displayPatientsDetails();
		patient1.getTotalPatients();
    }
}