package WildCard;

import java.util.ArrayList;
import java.util.List;

public class WildcardInGeneric {
    public static void main(String[] args){
        //animal.bark();//can not call the method of the
        //mehthod of the Dog with the Animal pointer

        //We can convert the one Dog object to the animal object;
        Animal animal = new Dog();
        animal.eat();
        animal.walk();
        //we can not convert the list of the dog object to animal object
        //it will give the runtime error
//        List<Dog> dogs = new ArrayList<>();
//        List<Animal> animals = dogs;

        //java allow this but it is very risky because it will
        //cause th runtime error
        Dog[] dogs =new Dog[10];
        Animal[] animals =dogs;
        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Animal() ;
        for(Animal animal1:animals){
            if(animal1==null){
                continue;
            }
            animal1.eat();
        }
    }
}
class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Banking");
    }
}