package MultiThreadingSolution;

public class Synchronizedkeyword {
    public static void main(String[] args){
        Test2 test =new Test2();
        Thread t1 =new Thread(()->{
            test.m1();
        });
        Thread t2 =new Thread(()->{
            test.m2();
        });
        t1.start();
        t2.start();
    }
}
class Test2{
    synchronized  void m1(){
        System.out.println("M1 entered");
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){}
        System.out.println("M1 Exit");
    }
    synchronized  void m2(){
        System.out.println("M2 entered");
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){}
        System.out.println("M2 Exit");
    }
}
