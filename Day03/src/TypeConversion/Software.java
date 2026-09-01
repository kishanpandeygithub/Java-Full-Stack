package TypeConversion;

public class Software {
    public static void main(String[] args) {
//        this is the program which is good for the understanding the type promotion
        byte b = 42;
        char c = 'a';
        short s= 100;
        int i = 5000;
        float f = 5.43f;
        double d = .124;
        double result = (f*b)+ (i/c)+(d*s);
        System.out.println((f*b) +" " + (i/c)+" "+( d*s));
        System.out.println(result);
    }
}
