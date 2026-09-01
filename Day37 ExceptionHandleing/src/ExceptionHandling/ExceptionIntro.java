package ExceptionHandling;

public class ExceptionIntro {
    public static void main(String[] args){
//        int num = 5/0;
//        System.out.println(num);

        //error
//        main(args);

        //why exception handling
        int a =5;
        int b = 0;
//        System.out.println("Step1");
//        System.out.println(a/b);
//        System.out.println("Step2");
        methodA(a ,b);
    }
    private  static void methodA(int a ,int b){
        methodB(a , b);
    }
    private static void methodB(int a ,int b){
        System.out.println(a/b);
    }
}
//exception error
