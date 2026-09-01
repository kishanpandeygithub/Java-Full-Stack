package OptionalClass;

import java.util.*;

public class ParallelStream {
    public static void main(String[] args){
        List<Integer> list  = new ArrayList<>(List.of(1 ,2 ,3 ,4 ,5 , 6, 7,  8 ,9 ,10 ,11));
//        list.stream()
//                .map(x->x*2)
//                .forEach(System.out::println);

        //parallel stream use the multithreading inside from it
        list.parallelStream()
                .map(x->x*2)
                .forEachOrdered(System.out::println);//it is the statefull forEachOrder
        //by using the parallel stream the multithreading is used so
        //it has no order because the thread completion time is different
    }
}
//it use the internal split iterator by which it take the elemetn one by one and apply the operation parallel
//because the map is the statless operation but the sorted is the statefull operation
//statefull:: the statefull oreration kill the parallism

//stateless::in the case of the stateless operation it can do the parallel
//it make the threads