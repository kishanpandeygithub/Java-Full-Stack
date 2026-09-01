package MethodStream;

import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 13, 15, 9));
        Set<Integer> list2 = list.stream()
                .map(x -> x + 1)
                .collect(Collectors.toSet());


        System.out.println(list2);

//        Optional<Integer> sum  = list.stream()
//                .reduce((a ,b)->a+b);
//        System.out.println(sum.get());
//        int sum  = list.stream()
//                .reduce(1 ,(a ,b)->a+b);
//        System.out.println(sum);

//        long num = list.stream()
//                .filter(x->x>10)
//                .count();
//        System.out.println(num);
//        Optional<Integer> num = list.stream()
//                .filter(x -> x > 10)
//                .findFirst();
//                .findAny();
//        System.out.println(num.get());

//        boolean num = list.stream()
//                .filter(x->x>10)
//                .noneMatch(x->x%2==0);
//
//        System.out.println(num);

        OptionalDouble avg = list.stream()
                .filter(x->x>10)
                .mapToInt(x->x)
                .average();
        System.out.println(avg.getAsDouble());
    }
}
//.toList();//this is the immuatable list
//.forEachOrdered(System.out::println);
//.reduce() combine stream into single vzlue
//findFirst() ->short circuiting
//.count();
//anyMatch()
//sum avarage max min ->wirk with the premitive stream