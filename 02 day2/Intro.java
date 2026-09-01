public class Intro {
    public static void main(String[] args){
        //  Integer and -> byte , short  ,int  , long
        byte b = 10;
        short s = 10;
        int i = 100000;
        // long l = 4321234;
        //we can also add the as much as underscore in the number to increase the readebility
        long l = 43_21_234;

        //real numbers are 
        //In this line the f is necessary because the f denote this is the floating charcter because the morden 
        // compiler are build for the double
        float f = 10.3f;
        double d = 12.334;
        //we can store in the double in the scintific way
        double d_sc = 12.3e34;

        // charcters are
        char c = 'a';

        // boolean are
        boolean bool = true;

        System.out.println("integers are ->"+b+" "+ s + " "+ i +" " + l+" ");
        System.out.println("Real number are -> "+f+" "+ d +" "+ d_sc +" ");
        System.out.println("charcter are -> "+c+ " ");
        System.out.println("boolean are "+ bool + " ");

        //we can also represent the charcter in the other format like 
        //Binary(2) , Octal(8) , Hexadecimal(15)
        //binary(2)
        byte binary = 0b101;
        int octal = 0223;
        int Hexadecimal =0xF;
        System.out.println("Binary "+ binary + " octal " +octal+ " hexadecimal " +Hexadecimal );
    }
} 