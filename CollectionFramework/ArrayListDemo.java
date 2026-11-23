import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> s = new ArrayList<>();

        s.add("Mahee");
        s.add("Akshu");
        s.add("Pavi");
        s.add("Keshi");

        System.out.println("Students are: " + s);

        // get()
        System.out.println(s.get(0));

        // set()
        s.set(3, "Channi");
        System.out.println("After Update: " + s);

        // remove()
        s.remove("Keshi");
        System.out.println("After Remove: " + s);

        // size()
        System.out.println("Size of the ArrayList: " + s.size());
    }
}
