package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.getBalance());
        bank.withdraw(1000);
        System.out.println(bank.getBalance());
        bank.deposite(500);
        System.out.println((bank.getBalance()));
    }

}
