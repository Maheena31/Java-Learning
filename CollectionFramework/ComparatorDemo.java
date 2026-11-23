import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class product{
    String name;
    int price;

public product(String name, int price) {
    this.name = name;
    this.price = price;
}
void display() {
    System.out.println(name + " " + price);

}
}

class ProductName implements Comparator<product> {
    @Override
    public int compare(product arg0, product arg1) {
        return 0;
    }
}

class ProductPrice implements Comparator<product> {
    @Override
    public int compare(product arg0, product arg1) {
        return Integer.compare(arg0.price, arg1.price);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<product> al = new ArrayList<>();
        al.add(new product("Laptop:", 50000));
        al.add(new product("Mobile:", 20000));
        al.add(new product("Tablet:", 30000));
        al.add(new product("Watch:", 40000));

        //sort by name
        Collections.sort(al, new ProductName());
        System.out.println("Sorting by name");
        for (product p : al) {
            p.display();
        }

        //sort by price
        Collections.sort(al, new ProductPrice());
        System.out.println("Sorting by price");
        for (product p : al) {
            p.display();
        }
    }
}