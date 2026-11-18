package ExceptionHandling;

public class ThrowandThrowsKey {
    public static void checkEven(int num) {
       if(num%2==0){
        System.out.println("Even number ");
       }
       else{
       throw new ArithmeticException("Not even number ");
       }
    
    }
    public static void main(String[] args) {
        System.out.println("hello");
       try{
         checkEven(8);
       }
       catch(ArithmeticException e){
        System.out.println(e.getMessage());
       }
        
    }

}