public class AbstrectClassess {
    public static void main(String[] args){
        animal a = new Dog("Dog");
        System.out.println(a.name);
    }
}

abstract class animal{
    String name;
    animal(String name){
        this.name =name;
    }
    abstract void makeSound();
    void sleep(){
        System.out.println("Sleeping");
    }
    //can not be override+ 
    final void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Dog extends animal{
    Dog(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("Making the Barking Sound");
    }
}

//question1
//can abstructor can have constructor
