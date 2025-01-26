package inheritance.hierarchicalinheritance.bankaccounttypes;

// Creating FixedDepositAccount class that extends BankAccount
class FixedDepositAccount extends BankAccount
{
    int maturityPeriod;

    // Constructor for FixedDepositAccount class
    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod)
    {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    // Method to display fixed deposit account details
    void displayAccountType()
    {
        System.out.println("\nFixed Deposit Account details are ");
        super.displayAccountDetails();
        System.out.println("Maturity Period is " + maturityPeriod + " years");
    }
}
