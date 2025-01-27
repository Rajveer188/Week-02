package banking_system;

public class BankMain {
    public static void main(String[] args) {
        //create object of each account and add them to array
        BankAccount[] accounts = {
                new SavingsAccount("12345", "Rajveer Kajle", 6000),
                new CurrentAccount("54321", "Darshan Yadav", 120000)
        };

        for (BankAccount account : accounts) {
            //display account details
            account.displayDetails();
            //get intereset
            double interest = account.calculateInterest();
            System.out.println("Interest earned- " + interest);

            //check if account object of loanable
            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(5000);
                double eligibleAmount = loanable.calculateLoanEligibility();
                System.out.println("Loan Eligibility- " + ((eligibleAmount > 5000) ? "Yes" : "No"));
            }
        }
    }
}
