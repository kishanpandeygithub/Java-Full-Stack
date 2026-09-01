package MethodStream;

import java.util.*;
import java.util.stream.Stream;

public class IntermidiateMethod {
    public static void main(String[] args){
        List<Integer> list  = new ArrayList<>(List.of(11 ,34  ,13 ,4));
        //intermidiate function
        list.stream()
                .filter(x->x>10)
                .map(x->x*2)
                .peek(System.out::println)
                .sorted((a ,b)->b-a)
                .distinct()
                .forEach(System.out::println );
        List<List<Integer>> list2 = List.of(List.of(1 ,2) , List.of(3 ,4));
//        list2.stream()
//                .map(x->x.stream().map(y->y*2))
//                .forEach(System.out::println);

//        list2.stream()
//                .flatMap(x->x.stream())
//                .map(x->x*2)
//                .forEach(System.out::println);
//        Stream.iterate(0,x->x+1)
//                .limit(10)
//                .skip(5)
//                .forEach(System.out::println);
    }
}

//distinct () --> keep the unique vlaue by hashing
//limit ()
//skip()
//peek() //debuging