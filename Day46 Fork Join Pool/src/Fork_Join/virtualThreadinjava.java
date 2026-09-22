package Fork_Join;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class virtualThreadinjava {
    public static void main(String[] args){
//        Thread t1 = Thread.startVirtualThread(()->{
//            System.out.println(Thread.currentThread());
//        });
//        try{
//            t1.join();
//        }catch (Exception e){}

        ExecutorService executor =Executors.newVirtualThreadPerTaskExecutor();
        for(int i =0;i< 5;i++){
            executor.execute(()->{
                System.out.println("Task exicuted by :" + Thread.currentThread());
            });
        }
        try {
            Thread.sleep(3000);
        }catch (Exception e){}
        executor.shutdown();
    }
}
