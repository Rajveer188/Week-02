
// Program to Simulate an ATM

import java.util.Scanner;

class BankAccount {
    // Attribute
    String accountHolder;
    String accountNumber;
    double balance;

    // Construcor to initialze object
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // method to Depositing money
    void depositeMoney(double money) {
        balance += money;
        System.out.println("money deposite successfully");
        displayBalance();
    }

    // method to Withdrawing money
    void withdrawMoney(double money) {
        // if sufficient balance is not exists
        if (money > balance) {
            System.out.println("not enough money to withdraw");
            return;
        }
        balance = balance - money;
        System.out.println("money withdraw successfully");
        displayBalance();
    }

    // method to display current balance
    void displayBalance() {
        System.out.println("Current balance - " + balance);
    }
}

class SimulateATM {
    // main method
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // get input
        System.out.println("Enter account holder name - ");
        String name = input.nextLine();
        System.out.println("Enter account number - ");
        String accountNumber = input.nextLine();
        System.out.println("Enter balance - ");
        double balance = input.nextDouble();

        // create object of BankAccount class
        BankAccount bankAccount = new BankAccount(name, accountNumber, balance);

        // call methods of bank account
        bankAccount.displayBalance();
        System.out.println("enter amount to deposite");
        double deposite = input.nextDouble();

        bankAccount.depositeMoney(deposite);

        System.out.println("enter amount to withdraw");
        double withdraw = input.nextDouble();

        bankAccount.withdrawMoney(withdraw);

        // close scanner object
        input.close();
    }
}
