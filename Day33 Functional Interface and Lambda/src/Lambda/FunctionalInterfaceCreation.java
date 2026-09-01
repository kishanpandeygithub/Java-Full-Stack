package Lambda;

public class FunctionalInterfaceCreation {
    public static void main(String[] args){
//        Calculator c = new Addition();
//        int sum = c.calculate(2 ,4);
//        System.out.println(sum);
        Calculator c =(a ,b)->a+b;
        print(2 ,3 ,c);
    }

    public static void print(int a ,int b ,Calculator c){
        System.out.println(c.calculate(a ,b));
    }
}
@FunctionalInterface
interface Calculator{
    int calculate(int a , int b);
}

//class Addition implements Calculator{
//    @Override
//    public int calculate(int a ,int b){
//        return a+b;
//    }
//}