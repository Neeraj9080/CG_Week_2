package inheritance.multilevelinheritance.onlineretailordermanagementsystem;

// Creating Order class to store order details
public class Order
{
    // Creating attribute of the class
    String orderId;
    String orderDate;

    // Creating constructor of the class
    Order(String orderId, String orderDate)
    {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display details
    void getOrderStatus()
    {
        System.out.println("Order Id is " + orderId);
        System.out.println("Order Date is " + orderDate);
    }

}
