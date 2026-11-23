package ExceptionHandling.CreatingException.BankSystem;

public class SavingsAccount {
    int balance = 1000;

    void withdraw(int amount)throws BankException{
        if (amount >balance){
            throw new 
            BankException("Insuffient Balance");
        }
        System.out.println(amount+  "Debited  from your account");
        balance-=amount;
    }
    void deposite(int amount){
        System.out.println("Amount Credited");
        balance+=amount;
    }
    void getBal(){
        System.out.println("Balance "+balance);
    }
    
}
