package banking_system;

// Abstract class to represent Bank account
abstract class BankAccount {
    //Attribute
    private String accountNumber;
    private String holderName;
    private double balance;

    // constructor to initialize bank account
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Account number cannot be null");
        }
    }
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        if (holderName != null){
            this.holderName = holderName;
        } else {
            System.out.println("Holder name cannot be null");
        }
    }
    public double getBalance() {
        return balance;
    }

    //method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited- " + amount);
        } else {
            System.out.println("amount must be greater than 0");
        }
    }

    //method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn- " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    //abstract method for interest calculation
    public abstract double calculateInterest();

    //method to display account details
    public void displayDetails() {
        System.out.println("\nAccount Number - " + accountNumber +
                    "\nHolder Name - " + holderName +
                    "\nBalance: " + balance);
    }
}

