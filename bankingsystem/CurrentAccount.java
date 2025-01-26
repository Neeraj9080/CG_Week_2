package bankingsystem;

// Creating class CurrentAccount that extends BankAccount
class CurrentAccount extends BankAccount
{
    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance)
    {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest()
    {
        // 3% interest for current account
        return getBalance() * 0.03;
    }

    // Method to display details
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Current Account total interest is " + calculateInterest());
    }
}
