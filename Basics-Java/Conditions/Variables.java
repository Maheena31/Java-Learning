package Conditions;

public class Variables {

    public void add() {
        int a = 10;
        int b = 20;

        System.out.println("Addition: " + (a+b));
    }

    public static void sub() {
        int a = 10;
        int b = 20;

        System.out.println("Subtraction: " + (a-b));
    }

    public static void main(String[] args) {

        Variables m = new Variables();

        m.add();
        m.sub();
    }
}