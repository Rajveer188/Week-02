import java.util.ArrayList;
import java.util.List;

//class to represent Account
class Account {
    //Attribute
    private Bank bank;
    private double balance;

    //constructer to initalize account
    public Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }
    //method to get bank object
    public Bank getBank() {
        return bank;
    }
    //method to get balance
    public double getBalance() {
        return balance;
    }
}
//class to represent customer
class Customer{
    //instance variable
    private String name;
    private ArrayList<Account> accountsList;

    //constructer to initalize customer
    public Customer(String name) {
        this.name = name;
        this.accountsList = new ArrayList<>();
    }
    //method to add account in customer
    public void addAccount(Account account) {
        accountsList.add(account);
    }
    //method to view balance
    public void viewBalance() {
        System.out.println("Customer- " + name);
        for (Account account : accountsList) {
            System.out.println("Balance- " + account.getBalance() + " in Bank - " + account.getBank().getName());
        }
    }
}

//class to represent bank
class Bank{
    private String bankName;
    private List<Customer> customerList;

    //constructer to initialize bank
    public Bank(String bankName){
        this.bankName = bankName;
        this.customerList = new ArrayList<>();
    }
    //method to get bank name
    public String getName(){
        return bankName;
    }
    //method to open account
    public void openAccount(Customer customer, double balance) {
        Account account = new Account(this, balance);
        customer.addAccount(account);
        customerList.add(customer);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        //main method
        Bank bank1 = new Bank("State Bank of india");
        Bank bank2 = new Bank("City Bank");

        Customer rajCustomer = new Customer("Raj");
        Customer veerCustomer = new Customer("Veer");

        bank1.openAccount(rajCustomer, 96000);
        bank1.openAccount(veerCustomer, 55000);
        bank2.openAccount(veerCustomer, 69000);

        rajCustomer.viewBalance();
        veerCustomer.viewBalance();
    }
}
