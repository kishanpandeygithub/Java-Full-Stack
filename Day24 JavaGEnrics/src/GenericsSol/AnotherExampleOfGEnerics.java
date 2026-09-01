package GenericsSol;

public class AnotherExampleOfGEnerics {
    public static void main(String[] args){
//        Pair<Integer ,String> p1 =new Pair<Integer ,String>(2 ,"Kishan");
//        System.out.println(p1.first+" "+p1.second);
//        Integer y = getResult(10);\
//
//        int y = getResult(1);
//        System.out.println(y);

        printPair(11 ,"hello");
    }

    public  static<T>  T getResult(T x){
        return x;
    }

    public static <T ,U> void printPair(T first , U second){
        System.out.println(first + "  , "+ second);
    }
}
class Pair<T ,U>{
    T first;
    U second;
    Pair(T first  ,U second){
        this.first =first;
        this.second = second;
    }
}

//the standard format to make the method generic
//<T> returnType methodname(T parameter){
//
//}