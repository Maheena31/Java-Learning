package OOPSs.Inheritance;



class Bank {
    String bankName;

    void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }
}

class Account extends Bank {
    long accountNumber;
    double balance;
}

class SavingsAccount extends Account {
    double interestRate;

    void calculateInterest() {
        displayBankDetails();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");

        double interest = balance * interestRate / 100;
        System.out.println("Interest Amount: " + interest);
    }
}

public class BankingApplication{
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

        s.bankName = "SBI";
        s.accountNumber = 123456789;
        s.balance = 50000;
        s.interestRate = 4.5;

        s.calculateInterest();
    }
}
