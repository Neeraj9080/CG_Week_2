package inheritance.assitedproblem.vehicletransportsystem;

// Creating Vehicle class to store basic vehicle details
class Vehicle
{
    // Creating attribute of the class
    int maxSpeed;
    String fuelType;

    // Creating constructor of the class
    Vehicle(int maxSpeed, String fuelType)
    {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display details
    void displayInfo()
    {
        System.out.println("MaxSpeed is " + maxSpeed + "Kmph");
        System.out.println("Fuel type is " + fuelType);
    }
}
