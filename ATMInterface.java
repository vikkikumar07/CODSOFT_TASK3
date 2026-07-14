package CODSOFT_TASK3;
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Amount deposit function
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount +" Deposited Successfuly.");
        } else {
            System.out.println("Invalide Amount!");
        }
    }

    // withdraw amount function
    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid Amount!");
        } else if(amount > balance) {
            System.out.println("Insuffictient Balance!");
        } else {
            balance -= amount;
            System.out.println(amount +" Withdrawn Successfuly.");
        }
    }

    // check balance function
    public void checkBalance() {
        System.out.println("Current Balance : "+balance);
    }
}
public class ATMInterface {
    
}
