package WildcardImplement;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args){
        List<Dog> dog = new ArrayList<>();
        dog.add(new Dog());
        dog.add(new Dog());
//        fun(dog);//not alloud because we can not paa the list of dogs to the list of animals
         List<Animal> animals  = new ArrayList<>();
         animals.add(new Animal());
         animals.add(new Animal());
         fun(animals);
         //we can pass the dog list in the wildcard function
         fun(dog);
    }
//    static void fun(List<Animal> animals){
//        for (Animal animal:animals){
//            animal.eat();
//        }
//    }

    static void fun(List<?> value){
        for (Object obj:value){
            System.out.println(obj.getClass().getName());
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
class Dog extends Animal {
    void bark(){
        System.out.println("Banking");
    }
}