
package staticnonstatic;


class Student{
    int id =1;
    String name="pavi";
    float marks=100;
    String subject="java";
    static String clgname="VTU";

    void showStudentDetails(){
         System.out.println("Student Deatils are :" +"\n id = "+id +"\n name =" +name +" \n marks = "+marks +" \n subject = "+subject);
    }

    void showclgname(){
        System.out.println("collage name = "+clgname);
    }



}

class Bank{
    int bal = 2000;
    int empid = 2;
    void showbal(){
        System.out.println("Balance ="+bal);
    }

      void showid(){
        System.out.println("employe_id ="+empid);
    }
}
public class NonstaticExample {     

    public static void main(String[] args){
        Bank bank = new Bank();
        bank.showbal();
        bank.showid();

        Student s = new Student();
        s.showStudentDetails();
        s.showclgname();
    }

}
