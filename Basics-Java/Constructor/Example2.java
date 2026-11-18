
package Constructor;

class Person {
    int Balance;
    String Name;

    Person() {
        System.out.println("Bank Details:");
    }

    Person(int Balance, String Name) {
        System.out.println("Name: " + Name);
        System.out.println("Balance: " + Balance);
    }
}

public class Example2 {
    public static void main(String[] args) {

        Person p1 = new Person();

        Person p2 = new Person(50000, "Maheena");
    }
}
