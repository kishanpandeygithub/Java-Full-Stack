package MultiThreadProblem;

public class RaceCondition {
    public static void main(String[] args){
        Counter c1 = new Counter();
        Thread t1 =new Thread(()->{
            for(int i =0;i< 10000;i++){
                c1.Increment();
            }
        });
        Thread t2 =new Thread(()->{
            for(int i =0;i< 10000;i++){
                c1.Increment();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){ }

        System.out.println(c1.count);
    }
}
class Counter{
    int count = 0;
    void Increment(){
        count++;
    }
}