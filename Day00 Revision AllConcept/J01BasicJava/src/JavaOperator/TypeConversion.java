package JavaOperator;

public class TypeConversion {
    public static void main(String[] args){
        //in the java there is the two type of the type conversion in the java
        //1: is Implecit vonbersion
        //2: is Explecit type conversion

        //the only rule for the implecit type conversion is desinatoin should be wider
//        int a =10;
//        float f  = a;
//        System.out.println(f);

        //explecit type conversion
//        int i =127;
//        byte b =(byte) i;
//        System.out.println(b);
        //truncket type conversion
//        float f = 10.23f;
//        int i = (int) f;
//        System.out.println(i);

        //we can not convert the boolean in
//        int i =0;
//        boolean b = (boolean) i;this gives the error because we can not convert it into any of the data typa

        //*****************type promotion in the java*******************
        byte b = 10;
        byte b2 = 20;
        int i = 20;
        long l = 30;
        float f = 40.0f;
        double d = 50.0;

        //byte ans = b*b2;//this gives error because it converts it into int

        int ans = b*b2;
        System.out.println(ans);

        long ans2 = i*l;

        float ans3 = f* l;

        double ans4 = f*d;


    }
}
