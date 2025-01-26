package inheritance.assitedproblem.vehicletransportsystem;

// Creating Truck class to store truck details
class Truck extends Vehicle
{
    // Creating attribute of the class
    int payLoadCapacity;

    // Creating constructor of the class
    Truck(int maxSpeed, String fuelType)
    {
        super(maxSpeed, fuelType);
    }

    void setTruckDetails(int payLoadCapacity)
    {
        this.payLoadCapacity = payLoadCapacity;
    }

    // Method to display details
    void displayInfo()
    {
        super.displayInfo();
        System.out.println("PayLoad capacity of Truck is " + payLoadCapacity + "Tonnes");
    }
}
