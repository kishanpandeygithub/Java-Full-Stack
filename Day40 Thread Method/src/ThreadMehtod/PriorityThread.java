package ThreadMehtod;

public class PriorityThread {
    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            System.out.println("Costum 1 thread is running");
        });
        System.out.println(t1.getPriority());

        Thread t2 = new Thread(()->{
            System.out.println("Costom 2 Thread is running");
        });

        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
