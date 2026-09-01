package Lambda;

import java.util.SplittableRandom;
import java.util.function.*;

public class ConsumerFunctionalComposition {
    public static void main(String[] args){
        //print the string
        Consumer<String > printName =System.out::println;
        Consumer<String > printUppercase =s->System.out.println(s.toUpperCase());

        Consumer<String> pipeLine = printName.andThen(printUppercase);
        pipeLine.accept("kishan");
    }
}
