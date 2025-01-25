package hierarchical_inheritance.banking_system;

//class to represent saving account
public class SavingsAccount extends BankAccount{
    //Attribute
    private double interestRate;

    //constructor to initialize bank account
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    //overridden method to display account type
    @Override
    public void displayAccountType() {
        System.out.println("This is a Savings Account");
    }
    // method to display interest rate
    public void displayInterestRate() {
        System.out.println("Interest Rate -  " + interestRate);
    }
}
