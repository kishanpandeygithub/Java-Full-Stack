package Multithreading;

public class ThreadNmae {
    public static void main(String[] args){
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
        });
        Thread t2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
        });

        //before the starting the thread no thread is going to start
        t1.start();
        t2.start();
    }
}
