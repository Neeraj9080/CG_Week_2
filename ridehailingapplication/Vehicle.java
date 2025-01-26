package ridehailingapplication;

// Creating abstract class Vehicle
abstract class Vehicle
{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm)
    {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate total fare
    abstract double calculateFare(double distance);

    // Getter and Setter methods for encapsulation
    public String getVehicleId()
    {
        return vehicleId;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public double getRatePerKm()
    {
        return ratePerKm;
    }

    // Method to display details
    public void getVehicleDetails()
    {
        System.out.println("Vehicle ID is " + getVehicleId());
        System.out.println("Driver Name is " + getDriverName());
        System.out.println("Rate per kilometer is " + getRatePerKm());
    }
}