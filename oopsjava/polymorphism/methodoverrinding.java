package oopsjava.polymorphism;

class Whatsapp {

    public void status() {
        System.out.println("Seeing status");
    }

    public void calls() {
        System.out.println("We can do audio and video calls");
    }

    public void msg() {
        System.out.println("We can text and share audio, videos and files");
    }
}

class Whatsapp2 extends Whatsapp {

    @Override
    public void status() {
        System.out.println("Seeing status and reacting");
    }
}

public class methodoverrinding {

    public static void main(String[] args) {

        Whatsapp whatsapp = new Whatsapp();
        whatsapp.status();

        Whatsapp whatsapp2 = new Whatsapp2();
        whatsapp2.status();
    }
}