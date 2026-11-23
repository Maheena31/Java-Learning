package ExceptionHandling.CreatingException.VoterID;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(20, "abc");
        p.disp();
        try{
            p.checkEligibility(p.age);
        }
        catch(VoterIDException e){
            System.out.println(e.getMessage());
        }


    }
    
}
