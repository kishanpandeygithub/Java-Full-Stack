package AlternativeLock;
import  java.util.concurrent.locks.Lock;
import  java.util.concurrent.locks.ReentrantLock;

public class ReentatantLock {
    public static void main(String[] args){
        Resourse r1 = new Resourse();
        Thread t1 =new Thread(()->{r1.f1(); });
        Thread t2 = new Thread(()->{ r1.f1();});
        Thread t3 = new Thread(( )->{r1.f1(); });
        t1.start();
        t2.start();
        t3.start();
    }
}
class  Resourse{
    Lock lock  = new ReentrantLock();
    void f1(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" Entered");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
            System.out.println(Thread.currentThread().getName()+" Out");
        }
        finally {
            lock.unlock();
        }
    }
}
