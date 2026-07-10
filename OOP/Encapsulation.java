package OOP;


/* 
Encapsulation - this is where data is protected and can only be accessed with methods (bank keeps money private & can only be access with withdraw() and deposit())
Getter - methods used to return values of private data
Setter - methods used to modify values of private data


*/ 
public class Encapsulation {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Liam", 1000);

        System.out.println("Owner: " + account.getOwner());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(500);

        System.out.println("After Deposit: " + account.getBalance());

        account.setBalance(-100); // Invalid

        System.out.println("Final Balance: " + account.getBalance());

        account.withdraw(500);

        System.out.println("Final Balance: " + account.getBalance());

        // account.balance = 100000; ❌ ERROR
        // balance is private and cannot be accessed directly
    }
}

class BankAccount {

    // Private fields (hidden)
    private String owner;
    private double balance;

    // Constructor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Getter
    public String getOwner() {
        return owner;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter 
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}

