package Arrays;

class Empoyee{
    int id;
    String name;

    Empoyee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String toString(){
        return "id = "+id +"\n"+"name = "+name;
    }

}
public class ArrayOfObject {
    public static void main(String[] args) {
        Empoyee arr[]={new Empoyee(1,"abc"),new Empoyee(2,"xyz")};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        
    }

}