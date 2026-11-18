package OOPSs.Inheritance;


class Food {
    String foodName;
    double price;

    void displayFood() {
        System.out.println("Food Name: " + foodName);
        System.out.println("Price: " + price);
    }
}

class Pizza extends Food {
    String size;

    double calculatePrice() {
        if (size.equalsIgnoreCase("Large")) {
            return price + 100;
        } else if (size.equalsIgnoreCase("Medium")) {
            return price + 50;
        }
        return price;
    }

    void displayPizza() {
        displayFood();
        System.out.println("Size: " + size);
        System.out.println("Total Price: " + calculatePrice());
    }
}

public class FoodDelivery{
    public static void main(String[] args) {
        Pizza p = new Pizza();

        p.foodName = "Margherita Pizza";
        p.price = 200;
        p.size = "Large";

        p.displayPizza();
    }
}

