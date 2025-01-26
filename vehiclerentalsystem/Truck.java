package vehiclerentalsystem;

// Creating class Truck that extends Vehicle and implements Insurable
class Truck extends Vehicle implements Insurable
{
    // Constructor
    public Truck(String vehicleNumber, String type, double rentalRate)
    {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days)
    {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance()
    {
        // insurance for Truck
        return 5000;
    }

    @Override
    public void getInsuranceDetails()
    {
        System.out.println("Truck Insurance is  5000/day");
    }

    // Method to display details
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Truck insurance rate is " + calculateInsurance());
        System.out.println("Truck total rental cost is " + calculateRentalCost(30));
    }
}