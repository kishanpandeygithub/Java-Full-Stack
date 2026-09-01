package StreamInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermidiateOperation {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(List.of(1 ,4 , 34 ,7  ,7 ,1,24));
        //intermidiate function
//        list.stream()
//                .filter(x-> x>10)
//                .map(x->x*2)  
//                .forEach(System.out::println);

        List<List<Integer>> list2 = List.of(List.of(1 ,2) ,List.of(3 ,4) , List.of(1 , 2));

        /*
        list2.stream()
                .flatMap(x->x.stream())
                .map(x->x*2)
                .forEach(System.out::println);
        */

        //sorted for the sorting the element
//        list.stream()
//                .filter(x->x>5)//stateless:it compute one by one when the element comes
//                .map(x->x*2)//state less
//                .sorted((a ,b)->b-a)//stateful::first collect all the element before proceding for the computation
//                .forEach(System.out::println);

        //distinct:keep unique value(it is also the state full)
//        list.stream()
//                .filter(x->x>5)
//                .map(x->x*2)
//                .distinct()
//                .forEach(System.out::println);

        //limit ::it is used to limet the valude
//        Stream.iterate(1 , (x->x+1))
//                .limit(10)
//                .forEach(System.out::println);
      //skip ::it is used to skip some of the values
//        Stream.iterate(1 , (x->x+1))
//                .skip(10)
//                .limit(20)
//                .forEach(System.out::println);

        //peek:: it observe the pipeline in the stream
        list.stream()
                .filter(x->x>5)
                .map(x->x*2)
                .peek(System.out::println)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
