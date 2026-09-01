package CollectionFrameWork;

import java.util.*;

public class Iterable {
    public static void main(String[] args){
        Collection<Integer> list =new HashSet<>();
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(16);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

//iterable
//10 ,12 , 14 ,15 ,16