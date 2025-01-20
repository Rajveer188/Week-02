//import scanner class
import java.util.Scanner;

//Base class
class BankAccount {
    // Attribute
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // constructor to initialize account detail
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // method to access the balance
    public double getBalance() {
        return balance;
    }

    // method to modify the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

    // method to display account details
    public void displayAccountDetails() {
        System.out.println("Account number- " + accountNumber +
                "\nAccount holder - " + accountHolder +
                "\nBalance - " + balance);
    }
}

// subclass SavingsAccount
class SavingsAccount extends BankAccount {

    // constructor for SavingsAccount
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // method to display details for SavingsAccount
    public void displaySavingsAccountDetails() {

        System.out.println("Account number- " + accountNumber +
                "\nAccount Holder- " + accountHolder);
    }
}

// main class
class BankManagment {
    // main method
    public static void main(String[] args) {
        // create scanner class object
        Scanner input = new Scanner(System.in);

        // get input for BankAccount
        System.out.println("Enter Account Number-");
        String bankAccountNumber = input.nextLine();

        System.out.println("Enter Account Holder Name-");
        String accountHolderName = input.nextLine();

        System.out.println("Enter Initial Balance-");
        double initialBalance = input.nextDouble();

        // create a BankAccount object
        BankAccount bankAccount = new BankAccount(bankAccountNumber, accountHolderName, initialBalance);
        System.out.println("\nBank Account Details-");
        bankAccount.displayAccountDetails();

        // modify balance
        System.out.println("\nEnter new Balance-");
        double updatedBalance = input.nextDouble();
        bankAccount.setBalance(updatedBalance);

        System.out.println("\nUpdated Bank account details");
        bankAccount.displayAccountDetails();

        // take input for SavingsAccount
        input.nextLine();
        System.out.println("\nEnter Savings Account number-");
        String savingsAccountNumber = input.nextLine();

        System.out.println("Enter Savings Account Holder Name-");
        String savingsAccountHolderName = input.nextLine();

        System.out.println("Enter Savings Account Initial Balance-");
        double savingsInitialBalance = input.nextDouble();

        // create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsAccountHolderName,
                savingsInitialBalance);
        System.out.println("\nSavings Account Details-");
        savingsAccount.displaySavingsAccountDetails();

        // Close the scanner
        input.close();
    }
}
