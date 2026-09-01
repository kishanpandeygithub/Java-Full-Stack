package JavaGenerics;

public class Generics {
    public static void main(String [] args){
        //upcasting
        String s ="hello";
         Object obj = s;

         System.out.println(obj);

         //downcasting
        Object obj2 = "hello";
        String s2  =(String) obj2;

        System.out.println(s2);

        Object obj3 = 10;
        String s3 =(String) obj3;
        System.out.println(s3);

    }
}
