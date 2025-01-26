package inheritance.assitedproblem.vehicletransportsystem;

// Creating Motorcycle class to store motorcycle details
class Motorcycle extends Vehicle
{
    // Creating attribute of the class
    int numberOfTyres;

    // Creating constructor of the class
    Motorcycle(int maxSpeed, String fuelType)
    {
        super(maxSpeed, fuelType);
    }

    void setMotorCycleDetails(int numberOfTyres)
    {
        this.numberOfTyres = numberOfTyres;
    }

    // Method to display details
    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Number Of Tyres in Motorcycle is " + numberOfTyres);
    }
}
