package MethodStream;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorInterface {
    public static void main(String [] args){
//        List<Integer> list = new ArrayList<>(List.of(1 ,13 ,14 ,9));
        List<String> list = new ArrayList<>(List.of("AA"  ,"BBB" ,"CCCC" ,"DD" ,"EEE"));
//        List<Integer> list2 = list.stream()
//                .map(x->x+1)
//                .collect(Collectors.toList());
//        System.out.println(list2);

//        Map<Integer , String> mp = list.stream()
////                .map(x->x+1)
//                .collect(Collectors.toMap(
//                        x->x.length() ,
//                        x->x
//                ));
//        Map<Integer , List<String>> mp = list.stream()
//                .collect(Collectors.groupingBy(x->x.length()));
//
//        System.out.println(mp);

        //we can partitioned
//        Map<Boolean , List<Integer>> mp = list.stream()
//                .collect(Collectors.partitioningBy(x->x%2==0));
//
//        System.out.println(mp);

//        Map<Integer , List<String>> mp = list.stream()
//                .collect(Collectors.groupingBy(
//                        x->x.length() ,
//                        Collectors.mapping(x->x.toLowerCase() , Collectors.toList())
//                        ));
//
//        System.out.println(mp);

        String result = list.stream()
                .collect(Collectors.joining("_"));
        System.out.println(result);
    }
}
//toMap , toList ,toSet
//gtoupingBy
//partioningBy
//joining