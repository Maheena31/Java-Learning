package OOPSs.Inheritance;


class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    double salary;
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Developer is writing code.");
    }
}

public class EmployeeManage {
    public static void main(String[] args) {
        Developer d = new Developer();

        d.name = "Ravi";
        d.age = 23;
        d.employeeId = 101;
        d.salary = 30000;
        d.programmingLanguage = "Java";

        d.writeCode();
    }
}

