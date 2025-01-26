package inheritance.multilevelinheritance.onlineretailordermanagementsystem;

// Creating Main Class
public class OnlineRetailOrderManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of DeliveredOrder class and calling its method
        DeliveredOrder obj = new DeliveredOrder("12345", "24/01/25","9876");
        obj.setDeliveryDate("26/01/24");
        obj.getOrderStatus();
    }
}