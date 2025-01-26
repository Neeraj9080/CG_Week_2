package vehiclerentalsystem;

// Creating class Bike that extends Vehicle and implements Insurable
class Bike extends Vehicle implements Insurable
{
    // Constructor
    public Bike(String vehicleNumber, String type, double rentalRate)
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
        // insurance for Bike
        return 500;
    }

    @Override
    public void getInsuranceDetails()
    {
        System.out.println("Bike Insurance is 500/day");
    }

    // Method to display details
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Bike insurance rate is " + calculateInsurance());
        System.out.println("Bike total rental cost is " + calculateRentalCost(60));
    }
}
