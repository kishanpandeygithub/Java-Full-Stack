package Multithreading;

public class RzunnableThread {
    public static void main(String[] args){
        MyRunnable r1 =new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}
