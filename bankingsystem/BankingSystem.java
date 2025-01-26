package bankingsystem;

// Creating Main class
class BankingSystem
{
    // Main method
    public static void main(String[] args)
    {
        SavingsAccount account1 = new SavingsAccount("123456789", "Rajan", 25000);
        CurrentAccount account2 = new CurrentAccount("987654321", "Abhishek", 5000);

        // Calling methods
        System.out.println("\nSaving account details are ");
        account1.displayDetails();
        account1.deposit(2000);
        System.out.println("Total Balance is " + account1.getBalance());

        System.out.println("\nSaving account details are ");
        account2.displayDetails();
        account2.withdraw(2500);
        System.out.println("Total Balance is " + account2.getBalance());
    }
}
