package CostomLock;

public class StaticSynchronazition {
    public static void main(String[] args){
        Thread t1 =new Thread(()->{
            Counter.incremet();
        });
        Thread t2 = new Thread(()->{
            Counter.incremet();
        });
        t1.start();
        t2.start();
    }
}
//static Synchronazation

class Counter{
    static int count =0;
     static void incremet(){
       synchronized (Counter.class){
           try {
               Thread.sleep(2000);
           }catch (Exception e){}
           count++;
           System.out.println(count);
       }
    }
}