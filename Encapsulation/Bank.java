package Encapsulation;

public class Bank {
    private int balance=2000;

    public  int getBalance(){
        return balance;
    }


    public void withdraw(int amount){
        System.out.println(amount+"Amt Credited");
        balance=balance+amount;
    }

    public void deposite(int amount){
        
    }
}
