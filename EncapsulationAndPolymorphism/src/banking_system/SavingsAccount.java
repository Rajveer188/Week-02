package banking_system;

//class to represent saving account
class SavingsAccount extends BankAccount implements Loanable {
    //Attribute
    private static final double INTEREST_RATE = 0.06;

    // constructor to initialize saving account
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    //override and implement abstract methods
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings account loan applied for - " + amount);
    }
    @Override
    public double calculateLoanEligibility() {
        //loan eligibility 2 time the amount
        return getBalance() * 3;
    }
}