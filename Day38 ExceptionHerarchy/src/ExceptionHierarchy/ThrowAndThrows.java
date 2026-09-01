package ExceptionHierarchy;

public class ThrowAndThrows {
    public static void main(String[] args){
//        try{
//            checkAligibility(-1);
//        }
//       catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//       }

        checkAligibility(-1);
    }
    private static void checkAligibility(int age){
        try {
            if (age <= 0) {
                throw new IllegalArgumentException("Age can not be negative");
            }
            if (age > 18) {
                System.out.println("You are eleigible to Vote");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}



//throw
//throws