package ExceptionHierarchy;

public class NEstedTryCatch {
    public static void main(String [] args){

        //exception is handel by the internal try block
//        try{
//            System.out.println("Outer try starts");
//            try {
//                System.out.println("Inner Try Block Starts");
//                System.out.println(5/0);
//            }
//            catch (ArithmeticException a){
//                System.out.println("Devide by zero is not allowed");
//            }
//        }
//        catch (ArithmeticException a){
//            System.out.println(a.getMessage());
//        }
//        System.out.println("Out of these blocks");

        try{
            System.out.println("Outer try starts");
            try {
                System.out.println("Inner Try Block Starts");
                System.out.println(5/0);
            }
            catch (NullPointerException n){
                System.out.println("Null pointer exception");
            }

        }
        catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }
        System.out.println("Out of these blocks");
    }
}
