package LockFreeConcurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class reTryLoop {
    public static void main(String[] args){
        LikeCounter likeCounter = new LikeCounter();
        Thread t1 = new Thread(()->{
            for(int i =0;i< 10;i++){
                likeCounter.like();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i =0;i< 10;i++){
                likeCounter.like();
            }
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println(likeCounter.totalCount);
    }
}

//class LikeCounter{
//    AtomicReference<Integer> totalCount =new AtomicReference<>(0);
//    public void like(){
//        Integer currentCount =0;
//        Integer finalCount =0;
//
//        while (true){
//            // 1: we will capture the latest value of the total Count
//            currentCount = totalCount.get();
//            //Increment the likecounter by one
//            finalCount = currentCount+1;
//            //check again if the count is what i saw
//            if(totalCount.compareAndSet(currentCount ,finalCount)){
//                return;
//            }
//            //if a thread reaches here some one else has updated the counter value
//            //Re-try
//            System.out.println("Conflict detected Retrying");
//        }
//    }
//}

class LikeCounter{
    //we can reduce the code size by taking the atomic variabke because they provide us
    //automaticy the caompareAndGet method
    AtomicInteger totalCount = new AtomicInteger(0);
    public void like(){
        totalCount.incrementAndGet();
    }
}
