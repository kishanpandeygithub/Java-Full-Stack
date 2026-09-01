package wildcardBound;

import java.util.ArrayList;
import java.util.List;

//generics with lower bound
public class SuperWildcard {
    public static void main(String[] args){
        List<Animal> animals =new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        fun(animals);
    }
    public static void fun(List<? super Animal> value){
        value.add(new Animal());
        value.add(new Dog());
        //now we can not print the directy
        //we have to take the help of the objject class and cast it to the
        //Animal Class
        for(Object obj: value){
            Animal a = (Animal) obj;
            a.eat();
        }
    }
}
class Animal {
    void eat() {
        System.out.println("Animal Eating");
    }

    void walk() {
        System.out.println("Animal Walking");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dogs Eating");
    }

    void bark() {
        System.out.println("Banking");
    }
}
