package banking_system;

//class to represent current account
class CurrentAccount extends BankAccount implements Loanable {
    //Attribute
    private static final double INTEREST_RATE = 0.03;

    // constructor to initialize current account
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    //override and implement abstract methods
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current account loan applied for -" + amount);
    }
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}