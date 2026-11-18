package ExceptionHandling;


public class Main {
   public static void main(String[] args) {
    int arr[]={1,2,3,4};
   try{
     System.out.println(arr[6]);
     System.out.println("hello");
   }
   catch(ArithmeticException e){
    System.out.println("Handle");
   }
   catch(Exception e){
    System.out.println("hello from exception");
   }
   finally{
    System.out.println("hello from finally block");
   }
   }
   
}