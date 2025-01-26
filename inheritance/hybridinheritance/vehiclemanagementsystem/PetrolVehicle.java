package inheritance.hybridinheritance.vehiclemanagementsystem;

// Creating PetrolVehicle class that extends Vehicle and implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable
{
    // Constructor for PetrolVehicle class
    PetrolVehicle(int maxSpeed, String model)
    {
        super(maxSpeed, model);
    }

    // Implementing refuel method from Refuelable interface
    public void refuel()
    {
        System.out.println("Refueling the petrol vehicle...");
    }
}

