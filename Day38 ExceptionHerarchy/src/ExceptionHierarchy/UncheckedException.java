package ExceptionHierarchy;

public class UncheckedException {
    public static void main(String[] args){
        try{
//            System.out.println(5/0);
//            String s =null;
//            s.length();
            Object object = "Hello";
            Integer i = (Integer) object;
        }
        //we can also write the throable but it is not recomended
        //because it also catch the error which is not good
        catch (ArithmeticException e){
            System.out.println("Devide by zero is not allowed");
        }
        catch (NullPointerException e){
            System.out.println("NUlls is not allowed");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
