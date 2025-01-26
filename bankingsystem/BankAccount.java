package bankingsystem;

// Creating Abstract class BankAccount
abstract class BankAccount
{
    // Attribute of the class
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Methods for deposit and withdraw
    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount)
    {
        if (amount <= balance)
        {
            this.balance -= amount;
        }
        else
        {
            System.out.println("Insufficient Balance on your account");
        }
    }

    // Abstract method for calculating interest
    public abstract double calculateInterest();

    // Getter and Setter methods for encapsulation
    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getHolderName()
    {
        return holderName;
    }

    public void setHolderName(String holderName)
    {
        this.holderName = holderName;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    // Method to display details
    public void displayDetails()
    {
        System.out.println("Account number is " + getAccountNumber());
        System.out.println("Account holder name is " + getHolderName());
        System.out.println("Balance is " + getBalance());
    }
}