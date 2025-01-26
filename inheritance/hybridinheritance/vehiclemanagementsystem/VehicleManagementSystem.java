package inheritance.hybridinheritance.vehiclemanagementsystem;

// Creating Main class
public class VehicleManagementSystem
{
    // Creating Main method
    public static void main(String[] args)
    {
        // Creating objects of classes
        ElectricVehicle vehicle1 = new ElectricVehicle(101, "TATA Nexon");
        System.out.println("\nElectric Vehicle details are ");
        vehicle1.displayInfo();
        vehicle1.charge();

        PetrolVehicle vehicle2 = new PetrolVehicle(102, "Mahindra Bolero");
        System.out.println("\nPetrol Vehicle details are ");
        vehicle2.displayInfo();
        vehicle2.refuel();
    }
}