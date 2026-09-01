package function;

import javax.annotation.processing.SupportedSourceVersion;

public class Recurtion {
    static void num(int n){
        if(n==0){
            return;
        }
        num(n-1);
        System.out.println(n);
    }

    //this is the program for finding the fibonacci series
    static  int Fib(int n){
        if(n<=1){
            return n;
        }
        int a =Fib(n-1);
        int b =Fib(n-2);
        return a+b;
    }
    public  static void  main(String[] args){
//        the recurtion is the process in which the function call it self
        num(5);
        System.out.println(Fib(6));
    }

}
