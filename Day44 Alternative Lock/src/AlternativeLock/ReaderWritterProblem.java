package AlternativeLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReaderWritterProblem {
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
    ReadWriteLock rwLock = new ReentrantReadWriteLock();
    Lock rl  = rwLock.readLock();//shared lock
    Lock wl  = rwLock.writeLock();//exclusive lock

    public  int read(){
        rl.lock();
        try{
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
            System.out.println(Thread.currentThread().getName() +" Reads the value");
            return  value;
        }
        finally {
            rl.unlock();
        }
    }
    public void write(int newValue){
        wl.lock();
        try {
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
            value = newValue;
            System.out.println(Thread.currentThread().getName()+" Write the value ");
        }
        finally {
            wl.unlock();
        }
    }
}