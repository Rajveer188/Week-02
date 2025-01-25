package hierarchical_inheritance.banking_system;

//base class
public class BankAccount {
    //Attribute
    private String accountNumber;
    private double balance;

    //constructor to initialize bank account
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number- " + accountNumber);
        System.out.println("Balance- " + balance);
    }
    // method for displaying account type
    public void displayAccountType() {
        System.out.println("This is a Normal bank account");
    }
}
