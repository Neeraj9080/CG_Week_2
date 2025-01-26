package ridehailingapplication;

// Creating class Car that extends Vehicle and implements GPS
class Car extends Vehicle implements GPS
{
    private String currentLocation = "Bhopal";

    // Constructor
    public Car(String vehicleId, String driverName, double ratePerKm)
    {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance)
    {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation()
    {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation)
    {
        this.currentLocation = newLocation;
    }

}