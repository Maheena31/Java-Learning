package OOPSs.Inheritance;

class Employee{
    int id;
    String name;
    int sal;

    void dispDetails(){
        System.out.println("Show Details");
    }

    void calSal(){
        System.out.println("Calculate Salary");
    }
}

class Dev extends Employee{
    String lang = "Java";

    void dispDetails(){
        super.dispDetails();
        System.out.println("Developer");
    }
}
class Testing extends Employee{
    String lang = "Pyth";

    void dispDetails(){
        System.out.println("Testing");
    }
}


public class Hirarchical {
    public static void main(String[] args) {
        Dev d = new Dev();
        System.out.println(d.lang);
        d.dispDetails();

        Testing testing = new Testing();
        System.out.println(testing.lang);
        testing.dispDetails();
    }
    
}
