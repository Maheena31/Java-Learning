package oopsjava;

class learning {

    public void course() {
        System.out.println("Only recorded videos");
    }
}

class learning2 extends learning {

    public void course() {
        super.course();
        System.out.println("Only live sessions");
    }
}

public class overridingexample2 {

    public static void main(String[] args) {

        learning2 v2 = new learning2();
        v2.course();
    }
}