package GenericsSol;

public class GenericsSolution {
    public static void main(String[] args){
        Box<Integer> b1 = new Box<Integer>(10);//type argument
        System.out.println(b1.getValue());
        Box<String> b2 = new Box<String>("Hello");//type argument
        System.out.println(b2.getValue());
        Box<Boolean> b3 = new Box<Boolean>(true);//type argument
        System.out.println(b3.getValue());

        //now it will throw the error in the compile time
        //that is much better the runtime erroe the represent the you
        //can not convert the interger to string (type cast exception )
        //String s = (String) b1.getValue();
    }
}
class Box<T>{
    private T value;
    Box(T value){
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }
    public void setValue(T value){
        this.value = value;
    }
}