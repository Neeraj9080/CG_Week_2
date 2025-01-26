package inheritance.hybridinheritance.vehiclemanagementsystem;

// Creating ElectricVehicle class that extends Vehicle
class ElectricVehicle extends Vehicle
{
    // Constructor for ElectricVehicle class
    ElectricVehicle(int maxSpeed, String model)
    {
        super(maxSpeed, model);
    }

    // Method to charge the electric vehicle
    void charge()
    {
        System.out.println("Charging the electric vehicle...");
    }
}