package Threads.BankSystem;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank();
        PhonePay p=new PhonePay(bank);
        p.disp();
    }


}
