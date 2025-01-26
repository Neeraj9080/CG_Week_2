package inheritance.hybridinheritance.vehiclemanagementsystem;

// Creating Vehicle class to store its details
class Vehicle
{
    int maxSpeed;
    String model;

    // Constructor for Vehicle class
    Vehicle(int maxSpeed, String model)
    {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle details
    void displayInfo()
    {
        System.out.println("Max Speed is " + maxSpeed + " km/h");
        System.out.println("Model is " + model);
    }
}
