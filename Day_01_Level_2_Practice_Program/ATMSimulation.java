// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class BankAccount to perform ATM operations
class BankAccount
{
    // Creating attributes of the BankAccount class
    private String accountHolder;
    private int accountNumber;
    private double balance;
    
    // Constructor of the BankAccount class
    BankAccount(String accountHolder, int accountNumber, double balance)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
	Scanner input = new Scanner(System.in);
    // Method to deposit money into account
    public void deposit()
    {
		System.out.println("Enter the amount ");
		double amount = input.nextDouble();
		
        balance = balance + amount;
        System.out.println("Deposited " + amount + " Current Balance " + balance);
    }

    // Method to withdraw money from account
    public void withdraw()
    {
		System.out.println("Enter the amount ");
	    double amount = input.nextDouble();
		
        if (balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Withdrawn " + amount + " Current Balance " + balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display current balance
    public void displayBalance()
    {
        System.out.println("Current Balance " + balance);
    }
}

// Creating Main class
class ATMSimulation
{
    // Main method of the class
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter account holder name ");
        String accountHolder = input.nextLine();
        System.out.println("Enter account number ");
        int accountNumber = input.nextInt();
        System.out.println("Enter current balance ");
        double balance = input.nextDouble();
        
        // Creating object of BankAccount class
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);
        
        // Performing ATM operations
		while(true)
		{
		System.out.println("\n 1. Display Balance  \n 2. Deposit \n 3. Withdraw \n 4. Exit ");
		int operation = input.nextInt();
		if(operation == 4)
		{
			break;
		}	
        else
		{	
		switch(operation)
		{
		    case 1:
			  account.displayBalance();
			  break;
			  
			case 2:
              account.deposit();
              break;
            
            case 3:
              account.deposit();
              break;		

            default:
              System.out.println("Error, Invalid Selection ");
              break;			  
		}
		}
		}
    }
}
