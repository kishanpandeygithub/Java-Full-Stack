package StampedLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class StampedLockTechnique {
    public static void main(String [] args){
        SharedResourse sh =new SharedResourse();
        Thread r1 = new Thread(()->{sh.read();});
        Thread r2 = new Thread(()->{sh.read();});
        Thread r3 = new Thread(()->{sh.read();});
        Thread w1 = new Thread(()->{sh.write(10);});
        Thread w2 = new Thread(()->{sh.write(20);});
        Thread w3 = new Thread(()->{sh.write(30);});
        r1.start();
        r2.start();
        r3.start();
        w1.start();
        w2.start();
        w3.start();
    }
}





class SharedResourse{
    private int value =0;
    StampedLock lock = new StampedLock();

    public  int read(){
        long stamp = lock.tryOptimisticRead();

        int currentValue = value;
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){

        }
        if(lock.validate(stamp)==false){
            //fall over logic
            //try pesimistic read
            stamp = lock.readLock();
            try{
                currentValue = value;
            }
            finally {
                lock.unlock(stamp);
            }
        }
        System.out.println(Thread.currentThread().getName()+" reads the value "+ currentValue);
        return currentValue;
    }
    public void write(int newValue){
        long stamp =  lock.writeLock();
        try {
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
            value = newValue;
            System.out.println(Thread.currentThread().getName()+" Write the value ");
        }
        finally {
            lock.unlock(stamp);
        }
    }
}