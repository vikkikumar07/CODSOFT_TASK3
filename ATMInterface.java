package CODSOFT_TASK3;
import java.util.Scanner;

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

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean exit = true;

        while(exit) {
            System.out.println("==== ATM MENU ====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");
            choice =sc.nextInt();

            switch(choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter Deposit Amount : ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;
                case 3:
                    System.out.println("Enter Withdraw Amount : ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case 4: 
                    exit = false;
                    break;
                default :
                    System.out.println("Invalid Choice.");

            }
        }
        sc.close();
    }
}

public class ATMInterface {
    public static void main(String[] args) {

        // initial balance 1000
        BankAccount account = new BankAccount(1000);

        ATM atm = new ATM(account);

        atm.start();
    }
}
