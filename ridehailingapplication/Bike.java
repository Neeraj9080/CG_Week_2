package ridehailingapplication;

// Creating class Bike that extends Vehicle and implements GPS
class Bike extends Vehicle implements GPS
{
    // Constructor
    private String currentLocation = "Delhi";

    public Bike(String vehicleId, String driverName, double ratePerKm)
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
