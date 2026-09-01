package ExceptionHandling;

public class ExceptionHandlingInChainOfMethod {
    public static void main(String[] args){
        //exception hanclind in the chain of the method
        System.out.println("Step1");
        try{
            methodA(5 ,0);
        }
        catch (ArithmeticException a){
            a.printStackTrace();
        }
        System.out.println("Step3");
    }
    private static void methodA(int a , int b){
//        try {
            methodB(a , b);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Devision by 0 is not allowed");
//        }
    }
    private static void methodB(int a  , int b){
        System.out.println(a/b);
        System.out.println("Step2");
    }
}
