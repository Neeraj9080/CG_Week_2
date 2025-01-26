package inheritance.multilevelinheritance.onlineretailordermanagementsystem;

// Creating ShippedOrder class to store its details
class ShippedOrder extends Order
{
    // Creating attribute of the class
    String trackingNumber;

    // Creating constructor of the class
    ShippedOrder(String orderId, String orderDate,String trackingNumber)
    {
        super(orderId,orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus()
    {
        super.getOrderStatus();
        System.out.println("Tracking Number is "  + trackingNumber);
    }
}
