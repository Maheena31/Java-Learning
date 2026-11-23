package Threads.ThreadsExample;

/* 
class A extends Thread{
    public void run(){
        for(int i=10;i<=20;i++){
            
           // System.out.println(Thread.currentThread().getName());
        }
    }
}

/*class B extends Thread{
    public void run(){
         for(int i=200;i<=300;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}


class C extends Thread{
    public void run(){
        
         for(int i=300;i<=400;i++){

           System.out.println(Thread.currentThread().getName());
        }
    }
} 
public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        System.out.println(a.getState());
        a.start();
        System.out.println(a.getState());
        a.sleep(100000);
        System.out.println(a.getState());
        a.join();
        System.out.println(a.getState());



       /*  a.setPriority(Thread.MIN_PRIORITY);
        
        B b=new B();
        b.setPriority(Thread.MIN_PRIORITY);
       
        C c= new C();
        c.setPriority(Thread.MAX_PRIORITY);
        
        c.start();
        c.join();
        a.start();
        b.start(); 
    }
}
*/

class SharedResource {
    // Used to demonstrate WAITING (wait/notify) and BLOCKED (synchronized lock contention)
    public synchronized void waitForSignal() {
        try {
            // Releases lock and puts calling thread into WAITING
            wait(); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void holdLockAndNotify() {
        try {
            // Holds the lock for 2 seconds so other threads trying to enter become BLOCKED
            Thread.sleep(2000);
            // Wakes up any thread in WAITING
            notifyAll();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class A extends Thread {
    public void run() {
        try {
            // Enters TIMED_WAITING
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (int i = 10; i <= 20; i++) {
            // Work loop
        }
    }
}

class B extends Thread {
    private final SharedResource resource;

    public B(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        // Calls wait() inside synchronized method -> enters WAITING
        resource.waitForSignal();

        for (int i = 200; i <= 300; i++) {
            // Work loop
        }
    }
}

class C extends Thread {
    private final SharedResource resource;

    public C(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        // Acquires lock, sleeps while holding it, then notifies B
        resource.holdLockAndNotify();

        for (int i = 300; i <= 400; i++) {
            // Work loop
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        A a = new A();
        B b = new B(resource);
        C c = new C(resource);

        // 1. NEW: Thread 'a' is created but not started
        System.out.println("1. State of A (created): " + a.getState());

        // 2. RUNNABLE: Thread 'a' is started
        a.start();
        System.out.println("2. State of A (started): " + a.getState());

        // Pause main briefly so 'a' enters Thread.sleep(1500)
        Thread.sleep(300);
        // 3. TIMED_WAITING: Thread 'a' is sleeping
        System.out.println("3. State of A (sleeping): " + a.getState());

        // Start 'b' -> it acquires lock and calls wait()
        b.start();
        Thread.sleep(300);
        // 4. WAITING: Thread 'b' is waiting indefinitely for notifyAll()
        System.out.println("4. State of B (after wait()): " + b.getState());

        // Start 'c' -> it grabs the lock that 'b' released and holds it for 2000ms
        c.start();
        Thread.sleep(300);

        // Create a temporary thread 'd' that tries to enter the locked resource while 'c' holds it
        Thread d = new Thread(resource::holdLockAndNotify);
        d.start();
        Thread.sleep(300);
        // 5. BLOCKED: Thread 'd' cannot enter synchronized method because 'c' holds the lock
        System.out.println("5. State of D (waiting for lock): " + d.getState());

        // Wait for all threads to complete
        a.join();
        b.join();
        c.join();
        d.join();

        // 6. TERMINATED: Thread 'a' has finished execution
        System.out.println("6. State of A (finished): " + a.getState());
    }
}
