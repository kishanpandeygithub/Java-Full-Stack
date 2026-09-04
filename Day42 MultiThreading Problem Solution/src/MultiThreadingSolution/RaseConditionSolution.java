package MultiThreadingSolution;

public class RaseConditionSolution {
    public static void main(String[] args){
        Counter c1 = new Counter();
        Thread t1 = new Thread(()->{
            for(int i =0;i< 10000;i++){
                c1.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i =0;i< 10000;i++){
                c1.increment();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){}

        System.out.println(c1.count);

    }
}
class Counter{
    public int count =0;
    synchronized void increment(){
        count++;
    }
}
