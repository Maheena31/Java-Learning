
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> s = new LinkedList<>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);

        System.out.println("Elements are: " + s);

        // get() - To get an element
        System.out.println(s.get(0));

        // set() - To update an element
        s.set(3, 50);
        System.out.println("After Update: " + s);

        // remove() - To remove an element
        s.remove(3);
        System.out.println("After Remove: " + s);

        // size() - To get the size
        System.out.println("Size of LinkedList: " + s.size());
    }
}
