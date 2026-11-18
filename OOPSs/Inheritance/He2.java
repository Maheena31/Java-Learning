package OOPSs.Inheritance;

class Animal{
    void sound(){
        System.out.println("Animals Sounds");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Boww");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meoww");
    }
}

class Monkey{
    void sound() {
        System.out.println("Gurrr");
    }
}

public class He2 {
    public static void sounds(Animal a){
        a.sound();
    }
    public static void main(String[] args) {
        sounds(new Dog());
        sounds(new Cat());
    }
}
