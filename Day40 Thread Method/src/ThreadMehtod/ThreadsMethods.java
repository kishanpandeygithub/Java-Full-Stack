package ThreadMehtod;

public class ThreadsMethods {
    public static void main(String[] args){
        //sleep method
        System.out.println("Main Thread Starts");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){

        }
        System.out.println("main Thread ends");
    }
}
