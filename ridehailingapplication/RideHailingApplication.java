package ridehailingapplication;

// Creating Main class
public class RideHailingApplication
{
    public static void main(String[] args)
    {
        Vehicle car = new Car("101", "Rajan", 50.0);
        Vehicle bike = new Bike("102", "Sachin", 10.0);
        Vehicle auto = new Auto("103", "Abhishek", 25.0);

        System.out.println("\nCar details are ");
        car.getVehicleDetails();
        System.out.println("Car Fare for 5 km is " + car.calculateFare(5));

        System.out.println("\nBike details are ");
        bike.getVehicleDetails();
        System.out.println("Bike Fare for 5 km is " + bike.calculateFare(5));

        System.out.println("\nAuto details are ");
        auto.getVehicleDetails();
        System.out.println("Auto Fare for 5 km is " + auto.calculateFare(5));

    }
}