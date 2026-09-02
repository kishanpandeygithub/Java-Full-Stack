package Multithreading;

public class ThreadState {
    public static void main(String[] args){
        Thread mainThread = Thread.currentThread();

         Thread t1 = new Thread(()->{
             System.out.println("Name of the thread is the "+Thread.currentThread().getName());
             System.out.println("MAin thread State is the "+mainThread.getState());
         });
         System.out.println(t1.getState());
         t1.start();
        System.out.println(t1.getState());
        try{
            Thread.sleep(2000);
        }catch (Exception e){}

        System.out.println(t1.getState());

    }
}
