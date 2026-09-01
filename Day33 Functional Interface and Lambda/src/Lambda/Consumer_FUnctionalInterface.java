package Lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.*;

public class Consumer_FUnctionalInterface {
    public static void main(String[] args){
        //*****consumer Functional interface

        Consumer<Integer> print= (x)->System.out.println(x);
        print.accept(6);

        //**********Supplier Fzunctional Interface
        Supplier<Double> randomvalue = ()->Math.random();
        System.out.println(randomvalue.get());

        //*********Predicate *************
        Predicate<Integer> even = (x)-> x%2==0;
        System.out.println(even.test(7 ));

        //*********** forEach method***********
        List<Integer> list = new ArrayList<>(List.of(1 ,2 ,3 ,4 ,5 ,6 ,7));
        //it take the object of the consumer type
//        list.forEach((x)->System.out.println(x));
        list.forEach(System.out:: println);


    }
}
