package Multithreading;

public class ThreadStart_ThreadRun {
    public static void main(String[] args){
         Thread t1 =new Thread(()->{
             System.out.println("The thread name is "+Thread.currentThread().getName());
         });
         t1.start();
         t1.run();
    }
}

//start() or run()
