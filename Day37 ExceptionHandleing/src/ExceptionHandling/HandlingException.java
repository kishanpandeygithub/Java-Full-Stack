package ExceptionHandling;

public class HandlingException {
    public static void main(String [] args){
        System.out.println("Step1");
        try{
            int a  = 5;
            int b = 0;
            System.out.println(a/b);
        }
        catch (ArithmeticException a){
            System.out.println("Devesion by zero is not allowed");
        }

        System.out.println("Step1");
    }
}
