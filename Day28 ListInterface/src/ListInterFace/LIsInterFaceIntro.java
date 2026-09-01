package ListInterFace;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LIsInterFaceIntro {
    public static void main(String[] args){
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        System.out.println(list.get(1) );
//        list.set(1 , 4);
//        list.add(2 ,3);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list.indexOf(2));
//        System.out.println(list.lastIndexOf(4));

        ListIterator<Integer> it = list.listIterator(1);
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        List l = List.of(1 ,2 ,3 ,4 ,5);
//        l.add(4);//can not mofifiable
        System.out.println(l);

        List<Integer> l2 =List.copyOf(l);
        System.out.println(l2);
    }
}
