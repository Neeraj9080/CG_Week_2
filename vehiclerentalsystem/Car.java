package vehiclerentalsystem;

// Creating class Car that extends Vehicle and implements Insurable
class Car extends Vehicle implements Insurable
{
    // Constructor
    public Car(String vehicleNumber, String type, double rentalRate)
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
        // insurance for Car
        return 1000;
    }

    @Override
    public void getInsuranceDetails()
    {
        System.out.println("Car Insurance is 1000/day");
    }

    // Method to display details
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Car insurance rate is " + calculateInsurance());
        System.out.println("Car total rental cost is " + calculateRentalCost(15));
    }
}