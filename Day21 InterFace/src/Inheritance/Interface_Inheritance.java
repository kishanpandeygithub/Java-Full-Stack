package Inheritance;

public class Interface_Inheritance {
    public static void main(String [] args){

    }
}
//interface inheritance
interface Animal{
    void eat();
}
interface Dog extends Animal{
    void Bark();
}
class StreetDog implements  Dog{
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void Bark(){
        System.out.println("Barking");
    }
}