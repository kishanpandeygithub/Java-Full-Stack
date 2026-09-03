package MultiThreadProblem;

public class VisibiltyPrroblem {
    static boolean flag =false;
    public static void main(String [] args){
        Thread t1  = new Thread(()->{
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
            flag = true;
        });
        Thread t2 = new Thread(()->{
            while (!flag){
                System.out.println("Thread 2 Running");
            }
            System.out.println("Thread 2 Finshed");
        });

        t1.start();
        t2.start();
    }
}
