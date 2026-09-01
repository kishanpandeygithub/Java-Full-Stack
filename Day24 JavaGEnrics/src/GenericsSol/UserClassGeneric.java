package GenericsSol;

public class UserClassGeneric {
    public static void main(String[] args){
        Boxi<Fish> b1 = new Boxi<>();
    }
}
class Boxi<T extends Animal& Swimmable>{
    T value;

}
class Animal{
    void display(){
        System.out.println("Displaying animal");
    }
}
class Dod extends Animal{

}
interface Swimmable{
    void swim();
}
class Fish extends Animal implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Swimable animal");
    }
}

//<T extends Class & interface1 , interface2 ...>