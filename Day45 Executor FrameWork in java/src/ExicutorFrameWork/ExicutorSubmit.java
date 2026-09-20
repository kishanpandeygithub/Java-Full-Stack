package ExicutorFrameWork;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExicutorSubmit {
    public static void main(String[] arga){
        //future and callable
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = executor.submit(()-> {
            try {
                Thread.sleep(3000);
            }
            catch (Exception e){}
            return 10;
        });

        try{
            System.out.println(f1.get());
        }
        catch (Exception e){}
        executor.shutdown();
    }
}
