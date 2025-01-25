package hierarchical_inheritance.banking_system;

//class to demonstrate bank's operations
public class Bank {
    public static void main(String[] args) {
        //create object of each account type
        SavingsAccount savings = new SavingsAccount("12345", 654354, 3.5);
        CheckingAccount checking = new CheckingAccount("67890", 2456654, 10005);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("11223", 100065, 12);

        // display details of each account
        savings.displayAccountDetails();
        savings.displayAccountType();
        savings.displayInterestRate();
        System.out.println();

        checking.displayAccountDetails();
        checking.displayAccountType();
        checking.displayWithdrawalLimit();
        System.out.println();

        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();
        fixedDeposit.displayDepositTerm();
    }
}
