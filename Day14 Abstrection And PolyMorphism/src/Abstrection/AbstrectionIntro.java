package Abstrection;

public class AbstrectionIntro {
    public static void main(String[] args) {
        Car car = new FuelCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}

abstract class Car {
    void start() {
        System.out.println("Car Started");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car {
    @Override
    void accelerate() {
        System.out.println("FuelCar is Accelerate at 10 km/h");
    }

    @Override
    void brake() {
        System.out.println("FuelCar is Stoping");
    }
}

class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("ElectricCarCar is Accelerate at 10 km/h");
    }

    @Override
    void brake() {
        System.out.println("ElectricCarCar is Stoping");
    }
}