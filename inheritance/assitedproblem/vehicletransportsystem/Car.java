package inheritance.assitedproblem.vehicletransportsystem;

// Creating Car class to store car details
class Car extends Vehicle
{
    // Creating attribute of the class
    int seatCapacity;

    // Creating constructor of the class
    Car(int maxSpeed, String fuelType)
    {
        super(maxSpeed, fuelType);
    }

    void setCarDetails(int seatCapacity)
    {
        this.seatCapacity = seatCapacity;
    }

    // Method to display details
    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Seating capacity of car is " + seatCapacity);
    }
}
