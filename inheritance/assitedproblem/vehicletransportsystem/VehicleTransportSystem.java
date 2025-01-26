package inheritance.assitedproblem.vehicletransportsystem;

// Creating Main class
class VehicleTransportSystem
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of Car class and calling its method
        Car car1 = new Car(400,"Disel");
        car1.setCarDetails(4);
        System.out.println("\nCar details are ");
        car1.displayInfo();

        // Creating object of Truck class and calling its method
        Truck truck1 = new Truck(70,"Disel");
        truck1.setTruckDetails(300);
        System.out.println("\nTruck details are ");
        truck1.displayInfo();

        // Creating object of Motorcycle class and calling its method
        Motorcycle motorcycle1 = new Motorcycle(250,"Petrol");
        motorcycle1.setMotorCycleDetails(2);
        System.out.println("\nMotorcycle details are ");
        motorcycle1.displayInfo();
    }
}
