package Operator;

public class ArithmaticOperator {
    public static void main(String[] args) {
        //arithmatic operator
        //+ ,- ,* ,/ , % ,+= ,-= ,*= , %= ,++ ,--
        int a = 5;
        int b = 10;
        int c = a + b;//15
        int d = a - b;
        int e = a * b;
        int f = b / a;
        int g = b % a;
        System.out.println(c + " " + d + " " + e + " " + f + " " + d + " ");
        int h = a + 2;
        h = h + 2;
        h += 2;
        h -= 2;
        h *= 2;
        h /= 2;
//      h%=2;

        int i = 6;
        i++;
        i--;
//        preIncrement and the predecrement
        --i;
        ++i;

        int k = i++;
        int l =++i;


        System.out.println(k+" " + l);
    }
}
