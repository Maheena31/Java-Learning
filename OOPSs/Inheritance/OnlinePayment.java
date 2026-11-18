package OOPSs.Inheritance;


class Payment {
    double amount;

    void makePayment() {
        System.out.println("Processing Payment");
    }
}

class UPI extends Payment {
    @Override
    void makePayment() {
        System.out.println("UPI Payment Successful: Rs." + amount);
    }
}

class CreditCard extends Payment {
    @Override
    void makePayment() {
        System.out.println("Credit Card Payment Successful: Rs." + amount);
    }
}

class DebitCard extends Payment {
    @Override
    void makePayment() {
        System.out.println("Debit Card Payment Successful: Rs." + amount);
    }
}

public class OnlinePayment {
    public static void main(String[] args) {
        UPI u = new UPI();
        u.amount = 1000;
        u.makePayment();

        CreditCard c = new CreditCard();
        c.amount = 2000;
        c.makePayment();

        DebitCard d = new DebitCard();
        d.amount = 1500;
        d.makePayment();
    }
}
