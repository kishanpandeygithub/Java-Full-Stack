package CostomLock;

import javax.management.ObjectName;

public class CoustomLockObject {
    public static void main(String[] args){
        Bank b1 = new Bank();
//        Thread t1 = new Thread(()->{
//            b1.Deposit();
//        });
//       Thread t2 = new Thread(()->{
//           b1.Withdraw();
//       });

        Thread t1 = new Thread(()->{
            b1.m1();
        });
        Thread t2 = new Thread(()->{
            b1.m1();
        });
       t1.start();
       t2.start();
    }
}

class Bank{
    Object lock1 = new Object();
    Object lock2 =new Object();

    void m1(){
        synchronized (new Object()){
            System.out.println(Thread.currentThread().getName()+"Entered m1");
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){}
            System.out.println(Thread.currentThread().getName()+"Exited m2");
        }
    }

     void Deposit(){
        synchronized (lock1){
            System.out.println("Deposit logic");
            try {
                Thread.sleep(2000);
            } catch (Exception e){}
        }
    }
     void Withdraw(){
        synchronized (lock2){
            System.out.println("WithDraw logic");
            try {
                Thread.sleep(2000);
            } catch (Exception e){}
        }
    }
}