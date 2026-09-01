package JavaGenerics;

public class GenericsProblem {
    public static void main(String [] args){
        Box b1 = new Box(10);
        Box b2 = new Box("Hello");
        Box b3 = new Box(true);
        System.out.println(b1.getValue());

        //Downcasting
        Integer x = (Integer) b1.getValue();
        String s = (String) b2.getValue();
        Boolean b = (Boolean) b3.getValue();

        System.out.println(x);
        System.out.println(s);
        System.out.println(b);
    }
}
class Box{
    private Object value;
    Box(Object value){
        this.value = value;
    }
    public Object getValue(){
        return this.value;
    }
    public void setValue(Object value){
        this.value = value;
    }
}

//class Box{
//    private int value;
//    Box(int value){
//        this.value =value;
//    }
//    public int getValue(){
//        return this.value;
//    }
//    public void setValue(int value){
//       this.value = value;
//    }
//}
//class Box2{
//    String value;
//}
//class Box3{
//    String value;
//}
