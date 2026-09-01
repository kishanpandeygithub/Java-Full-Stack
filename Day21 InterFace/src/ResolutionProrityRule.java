public class ResolutionProrityRule {
    public static void main(String[] args){
        C c = new C();
        c.fun();
    }
}
interface A{
    default void fun(){
        System.out.println("Inside A Interface");
    }
}
class B {
    public void fun(){
        System.out.println("Inside B  class");
    }
}
class C extends B implements A{

}