package GenericsSol;

public class BoundedGenerics {
    public static void main(String[] args){
        Integer x =4;
        Double d =2.22;
        Box2<Integer> b1 = new Box2<>();
        b1.value =21;
        b1.printDouble();
    }
}

//bound in generics
//Uppper Bound
class Box2<T extends Number>{
    T value;
    public void printDouble(){
        System.out.println(value.doubleValue());
    }
}


//class Box2<T>{
//    T value;
//    public void printDouble(){
//        System.out.println(value.hashCode());
//    }
//}