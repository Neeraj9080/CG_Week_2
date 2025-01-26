package vehiclerentalsystem;

// Creating Abstract class Vehicle
abstract class Vehicle
{
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate)
    {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Getter and Setter methods for encapsulation
    public String getVehicleNumber()
    {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public double getRentalRate()
    {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate)
    {
        this.rentalRate = rentalRate;
    }

    // Method to display details
    public void displayDetails()
    {
        System.out.println("Vehicle Number is " + vehicleNumber);
        System.out.println("Vehicle Type is " + type);
        System.out.println("Vehicle rental rate is " + rentalRate);
    }
}

