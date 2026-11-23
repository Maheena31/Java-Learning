package Threads.BankSystem;

public class PhonePay extends Thread{
    Bank bank;
    String op;
    PhonePay(Bank bank){
        this.bank=bank;
       
    }
    public void disp(){
        bank.withdraw(1000);
    }

}
