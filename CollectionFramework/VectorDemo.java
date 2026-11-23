
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println("Vector: " + v);

        // capacity() - Returns the capacity
        System.out.println("Capacity: " + v.capacity());

        // contains() - Checks whether element exists
        System.out.println("Contains 20: " + v.contains(20));

        // remove() - Removes an element by value
        v.remove(Integer.valueOf(30));
        System.out.println("After Remove: " + v);

        // for-each loop
        System.out.println("Vector Elements:");
        for (int h : v) {
            System.out.println(h);
        }

        // clear() - Removes all elements
        v.clear();
        System.out.println("After Clear: " + v);
    }
}
