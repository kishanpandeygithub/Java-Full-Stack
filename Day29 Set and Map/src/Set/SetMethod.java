package Set;

import java.util.HashSet;
import java.util.*;

public class SetMethod {
    public static void main(String[] args) {
        // Constructors of HashSet/ LinkedHashSet
        Set<Integer> set1  = new HashSet<>();//16  size
        //initial size
        Set<Integer> set2 =new HashSet<>(100);//initial capacity of the set
        //capacity + Loadfactor
        Set<Integer> set3 =new HashSet<>(100 , .8f);
        //using another collection
        Set<Integer> set4 =new LinkedHashSet<>(List.of(1 ,2 ,3 ,4 ,5 ,6,7));

    }

}
