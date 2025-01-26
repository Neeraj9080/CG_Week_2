package ridehailingapplication;

// Creating class Auto that extends Vehicle and implements GPS
class Auto extends Vehicle implements GPS
{
    private String currentLocation = "Mumbai";

    // Constructor
    public Auto(String vehicleId, String driverName, double ratePerKm)
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

