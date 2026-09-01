package AfterJAVA8;

public class Defaultmethod {
    public static void main(String [] args){
        Vehical v = new Car();
        v.drive();
        Vehical.Break();
    }
}
//After java 8
interface Vehical{
    default void drive(){
        System.out.println("Vehicle is dreving");
    };
    static void Break(){
        System.out.println("Break is applied");
    }
}
class Car implements Vehical{
    public void drive(){
        System.out.println("Car is dreving");
    }
}