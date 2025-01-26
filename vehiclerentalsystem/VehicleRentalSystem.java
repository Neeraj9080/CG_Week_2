package vehiclerentalsystem;

// Creating Main class
class VehicleRentalSystem
{
    // Main method
    public static void main(String[] args)
    {
        Car car1 = new Car("1122", "Car", 500);
        Bike bike1 = new Bike("3344", "Bike", 250);
        Truck truck1 = new Truck("5566", "Truck", 1000);

        // Callings Cars methods
        System.out.println("\nCars details are ");
        car1.displayDetails();
        car1.getInsuranceDetails();

        // Callings bikes methods
        System.out.println("\nBike details are ");
        bike1.displayDetails();
        bike1.getInsuranceDetails();

        // Callings trucks methods
        System.out.println("\nTruck details are ");
        truck1.displayDetails();
        truck1.getInsuranceDetails();

    }
}