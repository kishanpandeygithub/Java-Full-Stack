package INterface;

public class VariablesInInterfaces {
    public static void main(String[] args){
        MathConstant r1 = new Random();
        r1.fun();
        System.out.println(MathConstant.PI_VALUE);
    }
}
//variables inside interfaces
interface MathConstant{
    //by the rule of interface the vlaue in the interface
    //should be constants
    double PI_VALUE= 3.14;
    void fun();
}
class Random implements MathConstant{
    @Override
    public void fun(){
        System.out.println(PI_VALUE);
    }
}