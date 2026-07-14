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

}
public class ATMInterface {
    
}
