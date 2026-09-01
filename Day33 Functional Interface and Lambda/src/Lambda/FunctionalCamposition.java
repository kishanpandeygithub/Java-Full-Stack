package Lambda;

import java.util.function.*;

public class FunctionalCamposition {
    public static void main(String[] args){
//        Function<Integer ,Integer> equation = (x)->((x+2)*3);
        Function<Integer ,Integer> add2 = (x)->(x+2);
        Function<Integer ,Integer> multiply3 = (x)->(x*3);
        Function<Integer ,Integer> defide2 = (x)->(x/2);
//        System.out.println(equation.apply(2));

//        int a = add2.apply(2);
//        int b = multiply3.apply(a);

        int ans = multiply3.apply(add2.apply(2));
        int ans2 = add2.andThen(multiply3).apply(2);
        Function<Integer ,Integer> ansFunc = add2.andThen(multiply3);
        int ans3 = ansFunc.apply(2);

        System.out.println(ans2);
        System.out.println(ans3);
    }
}
