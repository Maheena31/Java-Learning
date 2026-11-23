import java.util.ArrayList;
import java.util.Collections;
class Student1 implements Comparable<Student1> {
    int id;
    String name;
    int marks;

    public Student1(int id, String name, int marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override 
    public int compareTo(Student1 o) {
        return this.marks- o.marks;
    }
    
    @Override 
    public String toString() {
        return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";  
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student1> s = new ArrayList<Student1>();
        s.add(new Student1(1, "Mahee", 90));
        s.add(new Student1(2, "Akshu", 80));
        s.add(new Student1(3, "Pavi", 70));
        s.add(new Student1(4, "Keshi", 60));

        Collections.sort(s);
        System.out.println("After Sorting by marks " );
        for (Student1 g : s) {
            System.out.println(g);
        }
    }
}