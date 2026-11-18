package staticnonstatic;

class Employee {

    static int salary = 50000;

    public static void details() {
        System.out.println("Employee details");
    }
}

class Employee2 extends Employee {

    public void display() {
        System.out.println("Hi");
    }
}

public class StaticExample {

    public static void main(String[] args) {

        Employee.details();

        int sal = Employee.salary;
        System.out.println(sal);

        Employee2 obj = new Employee2();
        obj.display();

        Employee2.details();
        System.out.println(Employee2.salary);
    }
}