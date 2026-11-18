
package Constructor;

class Student {
    String Name = "Maheena";
    int Age = 22;

    Student() {
        System.out.println("Student Details:");
    }

    Student(String Name, int Age) {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
    }
}

class StudentsDetails {
    String Name;
    int Age;
}

public class Example1 {
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s);

        Student s1 = new Student("Maheena", 22);
    }
}
