package Operator;

public class logicalOperator {
    public static void main(String[] args){
        //logical operator in
//        && -> AND, || -> OR
        int a =10;
        int b = 15;
        int c = 20;

        boolean d = ((a<b)&& (a>c));
        boolean e = ((a<b)|| (a>c));
        System.out.println(e);
    }
}
