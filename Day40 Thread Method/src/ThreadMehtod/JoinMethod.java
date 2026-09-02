package ThreadMehtod;

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException{
         System.out.println("Main Thread Start");
         Thread t1 = new Thread(()->{
             try {
                 Thread.sleep(2000);
             }
             catch (InterruptedException e){}
             System.out.println("Thread 0 start");
         });
         t1.start();
         t1.join();
         System.out.println("Main Thread ends");
    }
}
