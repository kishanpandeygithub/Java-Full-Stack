package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args){
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> it =list.iterator();
        while(it.hasNext())
        {
            int vlaue = it.next();
            if(vlaue==3){
                list.remove(vlaue);
            }
            System.out.println(vlaue);
        }
    }
}
