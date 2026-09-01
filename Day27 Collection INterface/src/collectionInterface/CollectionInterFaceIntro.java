package collectionInterface;

import java.util.*;

public class CollectionInterFaceIntro {
    public static void main(String[] args){
        Collection<Integer> c =new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println(c.size());
        //System.out.println(c.isEmpty());

        //boolean contains(Object o) ---> 1 ,2 ,3 --> equals()
        //boolean isC = c.contains(5);
        //System.out.println(isC);

        // Object toArray
        //the problem with this method that it give the array of the Object Class so
        //we dont get the good methods
//        Object[] obj = c.toArray();
//        for(Object o:obj){
//            System.out.println(o);
//        }
        //to resolve this java give the generic type of to array
        //that give tha array according to you but you hava to pass the type in the parameter
        //T[] toArray(T[] a)
//        Integer[] arr =c.toArray(new Integer[0]);
//        for(Integer i:arr){
//            System.out.println(i);
//        }

        //boolean add() method
//         boolean b = c.add(4);
//        System.out.println(b);

        //boolean remove(Object obj)
//        System.out.println(c.remove(2));
//        for(Integer i:c){
//            System.out.println(i);
//        }

        //bulk operation
        //boolean addAll(Collection<? extend E>c)
        c.addAll(List.of(5,6,7,8,9));
//        System.out.println(c);

        //boolean containsAll(Collecion<?> c);
//        System.out.println(c.containsAll(List.of(2 ,3 )));

        //boolean removeAll(Collection<?> c)
//        System.out.println(c.removeAll(List.of(6 ,7)));
        System.out.println(c);

        //boolean retainAll(Collection<?> c);
        c.retainAll(List.of(1 ,2 ,3));
        System.out.println(c);

        c.clear();
        System.out.println(c);
    }
}
