package Set;

import java.util.*;

public class TreeSetMethods {
    public static void main(String[] args) {
        //treeset
        TreeSet<Integer> set = new TreeSet<>();
        //by another collection
        //Set<Integer> set2 = new TreeSet<>(List.of(1,2,3,4,5));
        set.add(80);
        set.add(23);
        set.add(10);
        set.add(90);
        set.add(50);
/*
        //sortedset interface O(logn)
        //smallest element
        System.out.println(set.first());
        System.out.println(set.last());

        //less the
        System.out.println(set.headSet(80));
        //greater then equal to
        System.out.println(set.tailSet(23));
        //subset
        System.out.println(set.subSet(23 , 90));
*/

/*
        Navigable set
        //largest element smaller then 80
//        System.out.println(set.lower(80));
        //greatest elemet smaller then or equel to value
//        System.out.println(set.floor(70));
        //smallest number greater then 80
//        System.out.println(set.higher(80));
        //smallest number greater then equual 80 and
//        System.out.println(set.ceiling(40));
         //smallest element pop () and return
        System.out.println(set.pollFirst());
        //greater elemetn pop() and return
        System.out.println(set.pollLast());
         System.out.println(set.first());
        System.out.println(set.descendingSet());

        Iterator<Integer> it =set.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

 */

        System.out.println(set.headSet(23 ,true));
        System.out.println(set.tailSet(23 ,true));
        System.out.println(set.subSet(23 ,true , 90 , true));


    }
}
