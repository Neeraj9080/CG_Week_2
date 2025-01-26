package inheritance.hierarchicalinheritance.bankaccounttypes;

// Creating CheckingAccount class that extends BankAccount
class CheckingAccount extends BankAccount
{
    double withdrawalLimit;

    // Constructor for CheckingAccount class
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit)
    {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display checking account details
    void displayAccountType()
    {
        System.out.println("\nChecking Account details are ");
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit is " + withdrawalLimit);
    }
}