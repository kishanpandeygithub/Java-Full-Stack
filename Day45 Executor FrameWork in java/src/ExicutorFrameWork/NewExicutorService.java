package ExicutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NewExicutorService {
    public static void main(String[] args){
        ExecutorService exicutor = Executors.newFixedThreadPool(2);
//        try{
//            exicutor.execute(()->{
//                int x = 10/0;
//            });
//        }
//        catch (ArithmeticException e){
//            System.out.println("Catched Execurter exception ");
//        }
        Future<Integer> f1 =  exicutor.submit(()->{
            return (10/0);
        });
        try {
            System.out.println(f1.get());
        }catch (Exception e){
            System.out.println("Exception cached");
        }
        exicutor.shutdown();
    }
}
