package MultiThreadingSolution;

public class TestingRace {
    public static void main(String[] args){
        Test t = new Test();
        Thread t1 = new Thread(()->{
            t.Show();
        });

        Thread t2 = new Thread(()->{
            t.Show();
        });

        t1.start();
        t2.start();


    }
}
class Test{
    synchronized void Show(){
        System.out.println("Inside Show");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}

        System.out.println("Show Finished");;
    }
}