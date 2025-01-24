// Creating Product class to store product name, price per unit and quantity purchased
class Product 
{
    // Creating attributes of the class
    String productName;
    double pricePerUnit;
    double quantity;

    // Creating Constructor of the class
    public Product(String productName, double pricePerUnit, double quantity) 
    {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Method to get product name
    public String getProductName() 
    {
        return productName;
    }

    // Method to get price per unit of the product
    public double getPricePerUnit() 
    {
        return pricePerUnit;
    }

    // Method to get quantity purchased of the product
    public double getQuantity() 
    {
        return quantity;
    }

    // Method to calculate total price for this product
    public double getTotalPrice() 
    {
        return pricePerUnit * quantity;
    }
}

// Creating Customer class to store customer details and purchased products
class Customer 
{
    // Creating attributes of the class
    String customerName;
    Product[] purchasedProducts;

    // Creating Constructor of the class
    public Customer(String customerName, Product[] purchasedProducts) 
    {
        this.customerName = customerName;
        this.purchasedProducts = purchasedProducts;
    }

    // Method to get customer name
    public String getCustomerName() 
    {
        return customerName;
    }

    // Method to get purchased products
    public Product[] getPurchasedProducts() 
    {
        return purchasedProducts;
    }
}

// Creating BillGenerator class to compute total price for a customer
class BillGenerator 
{
    // Method to calculate the total bill for the customer
    public double calculateTotalBill(Customer customer) 
    {
        double totalAmount = 0.0;
        
        // Loop through each purchased product and sum the total
        for (Product product : customer.getPurchasedProducts()) 
        {
            totalAmount = totalAmount + product.getTotalPrice();
        }
        
        return totalAmount;
    }
}

// Creating Main class
public class GroceryStoreBillGenerator
{
    // Creating main method
    public static void main(String[] args) 
    {
        // Creating product objects for the customer
        Product[] products = { new Product("Apples", 3.0, 2), new Product("Milk", 2.0, 1) };

        // Creating customer object
        Customer customer = new Customer("Alice", products);

        // Creating BillGenerator object
        BillGenerator billGenerator = new BillGenerator();
        
        // Calculating total bill for the customer
        double totalBill = billGenerator.calculateTotalBill(customer);

        // Displaying the bill
        System.out.println("Customer name is " + customer.getCustomerName());
        System.out.println("Total Bill is $" + totalBill);
    }
}
