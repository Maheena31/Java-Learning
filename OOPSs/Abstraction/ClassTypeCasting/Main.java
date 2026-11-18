package OOPSs.Abstraction.ClassTypeCasting;

class A{
    void disp(){
        System.out.println("hello ");
    }
}

class B extends A{
    void show(){
        System.out.println("bye");
    }
}
public class Main {
    public static void main(String[] args) {
        // upcasting 
        // done by both implicit and explicit
        B b = new B();
        A a=new B();
        a.disp();
        // down casting 
        // without upcasting we can't perform down casting 
        // done by explicit
        A a2 = new B();
        B b2 =(B) a2;
        b2.show();
        b2.disp();

        
    }

}