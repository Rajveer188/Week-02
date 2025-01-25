package hierarchical_inheritance.banking_system;

//class to represent fixed deposit account
public class FixedDepositAccount extends BankAccount{
    //Attribute
    private int depositTerm;

    //constructor to initialize fixed deposit account
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }
    //overridden method to display account type
    @Override
    public void displayAccountType() {
        System.out.println("This is a fixed deposit Account.");
    }
    //method to display deposit term
    public void displayDepositTerm() {
        System.out.println("Deposit term -  " + depositTerm + " months");
    }
}
