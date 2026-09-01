package QueueINterface;

import java.util.*;

public class Queueinterface {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        //single queue specofin(single ended queue)
        //insertion
        queue.add(1);//throw exceprtion if fails
        queue.offer(2);//return false if it fails
        queue.offer(3);
        System.out.println(queue.peek());//return null if falils(empty)
        System.out.println(queue.element());//return exception if falis(empty)
        queue.poll();//return null if falils(empty)
        queue.remove();//return exception if falis(empty)
    }
}
