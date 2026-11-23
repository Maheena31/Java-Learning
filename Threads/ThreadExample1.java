package Threads;

public class ThreadExample1 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(100);
                System.out.println(i);
            }
            catch(InterruptedException e){
                System.out.println("Handle");
            }  
        }
    }
}
