package OOPSs.Inheritance;

class Employee {
    int employeeId = 101;
    String employeeName = "Maheena";
    int salary = 20000;

    void displayEmployeeDetails() {
        System.out.println("Emp ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Earning: " + salary);
    }

    void calculateSalary(){
        System.out.println("Annual Salary" +(salary*12));
    
    }
}

class Developer extends Employee {
    String programmingLanguage = "Python"; 

    void displayDeveloperDetails() {
        System.out.println("Developer " + employeeName + " works in " + programmingLanguage);
    }
}

public class EmployeeManagement {
    public static void main(String args) {
        Developer dev = new Developer();
        dev.displayEmployeeDetails();
        dev.calculateSalary(); 
        dev.displayDeveloperDetails(); 
    }
}
