package ExceptionHandling.CreatingException.VoterID;

public class VoterIDException extends Exception{
    String msg;
    VoterIDException(){
    }
    VoterIDException(String msg){
        this.msg = msg;
    }
    public String getMessage(){
        return msg;
    }

    
}
