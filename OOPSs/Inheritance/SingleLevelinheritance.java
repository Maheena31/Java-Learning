package OOPSs.Inheritance;

class Vehicle{
    void start(){
        System.out.println("Vehicle will be start");
    }
    void show(){
        System.out.println("Show the details of Vehicle car");
    }
    void stop(){
        System.out.println("Vehicle Stop");
    }
}

class BMWcar extends Vehicle{
    @Override
    void start() {
        // TODO Auto-generated method stub
        super.start();
        System.out.println("Play Music & Open Roofs");
    }

}

public class SingleLevelinheritance {
    public static void main(String[] args) {
        BMWcar BMW = new BMWcar();
        BMW.start();
        BMW.show();
        BMW.stop();
    }
    
}
