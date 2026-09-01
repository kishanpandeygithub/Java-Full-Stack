package Operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = ~a;
        System.out.println(c + " " + d + " " + e + " " + f);


//        left shift
        int g = 1;
//        g = g << 2;
//        g = g << 30;
//        g = g << 31;//-2147483648
        g = g << 32;//it is like nothing will be done like[ n%32]
        System.out.println(g);
// right shift
        int h = 2;
        h = h >> 1;
        h = h >> 1;

        byte j = 1;
//        j =j<<1;//this is giving the error to type conversion so we should do this
        j = (byte) (j << 1);

        int k = 1;
        k =k>>>1;

        System.out.println(k);
    }
}
