package inheritance.hierarchicalinheritance.bankaccounttypes;

// Creating BankAccount class to store its details
class BankAccount
{
    String accountNumber;
    double balance;

    // Constructor for BankAccount class
    BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    void displayAccountDetails()
    {
        System.out.println("Account Number is " + accountNumber);
        System.out.println("Balance is " + balance);
    }
}
