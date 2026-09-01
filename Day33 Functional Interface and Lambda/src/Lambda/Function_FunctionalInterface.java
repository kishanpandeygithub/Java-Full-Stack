package Lambda;

import java.util.function.*;

public class Function_FunctionalInterface {
    public static void main(String[] args){
        Function<Integer ,Integer> squre = (x)->x*x;
        System.out.println(squre.apply(5));
    }
}
