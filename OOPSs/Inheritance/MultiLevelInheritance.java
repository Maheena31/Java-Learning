package OOPSs.Inheritance;


class Vehicle{
    void start(){
        System.out.println("Vehicle will start");
    }

    void stop(){
        System.out.println("Vehicle will Stop");
    }
}

class Car extends Vehicle{
    int doors=4;

    void fuelType(){
        System.out.println("Some power need to start");

    }
}

class EVCar extends Car{
    int batCap=500;
    @Override
    void fuelType() {
        // TODO Auto-generated method stub
        super.fuelType();
        System.out.println("Need Battery to start car");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        EVCar e= new EVCar();
        e.start();
        e.stop();

        e.fuelType();
        System.out.println(e.doors);

        System.out.println(e.batCap);
        e.fuelType();
}

}




