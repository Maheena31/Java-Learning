package Threads.BankSystem;

public class Bank {
    private int balance=1000;
   
    public void withdraw(int amount){
        if (amount<=balance){
            System.out.println("Withdrawn amount: "+amount);
            balance-=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void deposit(int amount){
        System.out.println("Deposited amount: "+amount);
        balance+=amount;
    }
    
}
