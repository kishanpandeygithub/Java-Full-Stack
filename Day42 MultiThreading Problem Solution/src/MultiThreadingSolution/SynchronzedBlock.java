package MultiThreadingSolution;

public class SynchronzedBlock {
    public static void main(String[] args){
        Counter2 c1 = new Counter2();
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

class Counter2{
    public int count =0;
    void increment(){
        //normal code
        synchronized (this) {
            count++;
        }
        //normal code
    }
}


