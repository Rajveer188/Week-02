package hierarchical_inheritance.banking_system;

//class to represent checkingAccount
public class CheckingAccount extends BankAccount {
    //Attribute
    private double withdrawalLimit;

    //constructor to initialize check account object
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    // Overridden method to display account type
    @Override
    public void displayAccountType() {
        System.out.println("This is a Checking account");
    }
    // method to display withdrawal limit
    public void displayWithdrawalLimit() {
        System.out.println("Withdrawal limit - " + withdrawalLimit);
    }
}
