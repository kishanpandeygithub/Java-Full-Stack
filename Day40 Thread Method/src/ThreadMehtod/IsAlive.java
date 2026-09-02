package ThreadMehtod;

public class IsAlive {
    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
            System.out.println(Thread.currentThread().getName());
        });
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(Thread.currentThread().isAlive());
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName());
    }
}
