package ThreadMehtod;

public class DemonThread {
    public static void main(String [] args){
        Thread t1= new Thread(()->{
            while (true){
                System.out.println("Running");
            }
        });

        t1.setDaemon(true);
        t1.start();
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){}
        return;
    }
}
