package ExicutorFrameWork;

import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEcecutorExample {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));

        for(int i =1;i<7;i++){
            int taskId = i;
            executor.execute(()->{
                System.out.println("Task "+taskId+" is perfoemed by "+Thread.currentThread().getName());
            });
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
        }
        executor.shutdown();
    }
}
