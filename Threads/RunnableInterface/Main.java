package Threads.RunnableInterface;

class A implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

interface d {
    void show();
}

interface e {
    void show();
}

class C implements d, e {
    @Override
    public void show() {
        System.out.println("hello");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        t1.start();

        B b = new B();
        Thread t2 = new Thread(b);
        t2.start();

        C c = new C();
        c.show();
    }
}
