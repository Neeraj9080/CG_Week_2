package bankingsystem;

// Creating class SavingsAccount that extends BankAccount
class SavingsAccount extends BankAccount
{
    // Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest()
    {
        // 7% interest for savings account
        return getBalance() * 0.07;
    }

    // Method to display details
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Saving Account total interest is " + calculateInterest());
    }

}
