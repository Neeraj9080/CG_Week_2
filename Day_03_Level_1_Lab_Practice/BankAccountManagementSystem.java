// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class BankAccount to manage account details
class BankAccount
{
    // Instance variables 
    String accountNumber;
    String accountHolder;
    double balance;
	
	// creating class variables
	static String bankName;
	static int totalAccountCreated = 0;
    
    // Constructor to initialize bank account details
    BankAccount(String accountNumber, String accountHolder)
    {
		totalAccountCreated++;

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
	
	// Method to set account details
    public void setAccountDetails(String bank_Name)
    {
		bankName = bank_Name;
	}
	
	// Method to display account details
    public void displayAccountDetails()
    {
		System.out.println("Bank name is " + bankName);	
        System.out.println("Account Number is " + accountNumber);
        System.out.println("Account Holder is " + accountHolder);
    }
	
	// Public method to details total number of Account Created
	public static void getTotalAccounts()
	{
		System.out.println("Total Number of account created is " + totalAccountCreated); 
	}
}


// Creating Main class
class BankAccountManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
	   Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the bank name ");
	   String bankName = input.nextLine();
	   System.out.println("Enter the account number ");
	   String accountNumber = input.nextLine();
	   System.out.println("Enter the account holder name ");
	   String accountHolder = input.nextLine();
	   System.out.println("Enter the current balance of the account ");
	   double balance = input.nextDouble();
	   
	   // Creating a BankAccount object
	   BankAccount account = new BankAccount(accountNumber, accountHolder);
	   
	   // checking account is object of BankAccount class or not
	   if( account instanceof BankAccount )
	   { 
             System.out.println("Account is the object of bank class");
	   }
	   
	   // Storing account details
	   account.setAccountDetails(bankName);
	
       // Displaying account details and total number of account created
       account.displayAccountDetails();
	   account.getTotalAccounts();
    }
}
