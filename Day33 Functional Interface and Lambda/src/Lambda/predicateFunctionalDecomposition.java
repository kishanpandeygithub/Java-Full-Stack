package Lambda;

import java.util.function.*;

public class predicateFunctionalDecomposition {
    public static void main(String [] args){
        Predicate<Integer> isGreater = x->x>100;
        Predicate<Integer> isEven = x->x%2==0;
        Predicate<Integer> andResult = isGreater.and(isEven);
        Predicate<Integer> orResult = isGreater.or(isEven);
        System.out.println(andResult.test(12));
        System.out.println(orResult.test(12));
//        negate
        Predicate<Integer> isOdd = isEven.negate();
        System.out.println(andResult.or(isOdd).test(13));



    }
}
