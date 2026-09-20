package ExicutorFrameWork;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExicutorFrameWorkCreation {
    public static void main(String[] args){
        //exicutor framework
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //number of task = 5;
        for( int i =0;i<= 5;i++){
            int taskid = i;
            executor.execute(()->{
                System.out.println("Task "+ taskid+" is performed by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
