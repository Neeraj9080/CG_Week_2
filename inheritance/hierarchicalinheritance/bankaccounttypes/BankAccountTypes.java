package inheritance.hierarchicalinheritance.bankaccounttypes;

// Creating Main class
public class BankAccountTypes
{
    // Creating Main method
    public static void main(String[] args)
    {
        // Creating objects of the class
        SavingsAccount account1 = new SavingsAccount("112233", 10000.0, 3.5);
        account1.displayAccountType();

        CheckingAccount account2 = new CheckingAccount("445566", 2500.0, 1000.0);
        account2.displayAccountType();

        FixedDepositAccount account3 = new FixedDepositAccount("778899", 100000.0, 5);
        account3.displayAccountType();
    }
}
