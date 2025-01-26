package inheritance.hierarchicalinheritance.bankaccounttypes;

// Creating SavingsAccount class that extends BankAccount
class SavingsAccount extends BankAccount
{
    double interestRate;

    // Constructor for SavingsAccount class
    SavingsAccount(String accountNumber, double balance, double interestRate)
    {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    void displayAccountType()
    {
        System.out.println("\nSavings Account Details are ");
        super.displayAccountDetails();
        System.out.println("Interest Rate is " + interestRate + "%");
    }
}

