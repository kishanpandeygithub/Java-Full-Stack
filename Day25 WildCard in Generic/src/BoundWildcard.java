import java.util.ArrayList;
import java.util.List;

public class BoundWildcard {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        fun(dogs);
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        fun(animals);
    }

    static void fun(List<? extends Animal> value) {
//        for (Animal a : value) {
//            a.eat();
//        }
//        value.add(new  ())
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
