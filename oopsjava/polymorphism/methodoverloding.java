package oopsjava.polymorphism;


class Calculator{
    public static void add(int a,int b){
        System.out.println("sum of =" + (a+b));
    }

    public static void add(int a,int b,int c){
        System.out.println("sum of =" + (a+b+c));
    }
      public static void add(int a,float b){
        System.out.println("sum of =" + (a+b));
    
}

public class methodoverloding {

    public static void mian(String [] args)
    {
        Calculator.add(2,3);
    }
}

}
