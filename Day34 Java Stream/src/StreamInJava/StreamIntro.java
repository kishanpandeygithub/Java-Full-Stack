package StreamInJava;

import java.util.*;
import java.util.stream.Stream;

public class StreamIntro {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(List.of(1 ,2 ,34,11));
        Stream<Integer> s =  list.stream();
        s = s.filter(x->x>10);
        s = s.map(x ->x*10);
        s.forEach(System.out::println);

        list.stream()
                .filter(x->x>10)
                .map(x->x*10)
                .forEach(System.out::println);
    }
}
