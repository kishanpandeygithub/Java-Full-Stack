package ExceptionHandling;

public class ExceptionaFinally {
    public static void main(String[] args){
        System.out.println("Step1");
        try{
            //risky code
            int a =5;
            int b = 0;
            System.out.println(a/b);
            System.out.println("Step2");
        }
        catch (NullPointerException n){
            System.out.println("No null allowed");
        }
        catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }
//        finally {
//            //this always runs
//            System.out.println("");
//            //cleanup code (optional code)
//        }
        System.out.println("Step3");
    }
}
