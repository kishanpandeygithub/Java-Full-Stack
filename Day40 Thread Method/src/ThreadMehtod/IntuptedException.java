package ThreadMehtod;

public class IntuptedException {
    public static void main(String[] args){
        Thread t1 =new Thread(()->{
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("HI");
            }
        });
        t1.start();
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){}

        t1.interrupt();
    }
}
