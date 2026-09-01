package Interface;

public class InterfaceIntro {
    public static void main(String[] args) {
        car c =new ElectricCar() ;
        c.start();
        c.accelerate();
        c.brake();
    }
}

 interface car {
    void start();

    void accelerate();

    void brake();
}

class FuelCar implements car {
    public void start(){
        System.out.println("FuelCar Started");
    }
    @Override
    public void accelerate() {
        System.out.println("FuelCar is Accelerate at 10 km/h");
    }

    @Override
    public void brake() {
        System.out.println("FuelCar is Stoping");
    }
}

class ElectricCar implements car {
    public void start(){
        System.out.println("Electric Started");
    }
    @Override
    public void accelerate() {
        System.out.println("ElectricCarCar is Accelerate at 10 km/h");
    }

    @Override
    public void brake() {
        System.out.println("ElectricCarCar is Stoping");
    }
}
