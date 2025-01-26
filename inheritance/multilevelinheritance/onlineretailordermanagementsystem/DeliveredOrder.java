package inheritance.multilevelinheritance.onlineretailordermanagementsystem;

// Creating DeliveredOrder class to store its details
public class DeliveredOrder extends ShippedOrder
{
    // Creating attribute of the class
    String deliveryDate;

    // Creating constructor of the class
    DeliveredOrder(String orderId, String orderDate,String trackingnumber)
    {
        super(orderId,orderDate,trackingnumber);
    }

    // Method to add details
    void setDeliveryDate(String deliveryDate)
    {
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus()
    {
        super.getOrderStatus();
        System.out.println("Delivery date is " + deliveryDate);
    }
}