// Importing Scanner class
import java.util.Scanner;

// Creating Bank class to store bank details
class Bank
{
    // Creating attribute of the class
    private String bankName;
	private String branchName;
	
	// Creating Constructor of the class
	Bank(String bankName,String branchName)
	{
	    this.bankName = bankName;
		this.branchName = branchName;
	}
	
	// Method to open account of the customer
	public Customer openAccount()
	{
	   Customer object = new Customer();
	   object.getAccountDetails();
	   return object;
	}
	
	//Method to display bank details
	void displayBankDetails()
	{
		System.out.println("Bank name is " + bankName);
		System.out.println("Bank branch name is " + branchName);	
	}
}

// Creating Customer class to store customer details
class Customer
{	
    // Creating attribute of the class
    private String customerName;
	private int customerAge;
	private double balance;
	
	// Creating Constructor of the class
	Customer()
	{
	    this.customerName = "Guest";
		this.customerAge = 18;
		this.balance = 0.0;
	}
	
	Scanner input = new Scanner(System.in);
	// Method to get account details
	public void getAccountDetails()
	{
	    // Taking user input
	    System.out.println("Enter your Name ");
		this.customerName = input.nextLine();
		System.out.println("Enter your age ");
		this.customerAge = input.nextInt();
		System.out.println("Add minimum 1000 rupees to open your Account ");
		this.balance = input.nextDouble();
	}
	
	//Method to display customer details
	void displayCustomerDetails()
	{
		System.out.println("Customer name is " + customerName);
		System.out.println("Customer age is " + customerAge);
	}
	
    // Method to view account balance
     public void viewBalance()
	 {
	    System.out.println("Your current balance is " + balance);
	 }
}
// Creating Main Class
class BankAndAccount
{
    // Creating main method
    public static void main(String[] args)
	{
	    // Creating object of Bank class
	    Bank bank1 = new Bank("HDFC", "Bhopal");
		bank1.displayBankDetails();
		
		// Creating object of Customer class
		Customer customer1 = bank1.openAccount();
		customer1.displayCustomerDetails();
		customer1.viewBalance();
	}
}