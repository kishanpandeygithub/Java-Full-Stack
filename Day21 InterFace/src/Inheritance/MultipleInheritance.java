package Inheritance;

public class MultipleInheritance {
    public static void main(String [] args){
        A a = new C();
        a.fun();

    }
}
interface A{
    void fun();
}
interface B{
    void fun2();
}
class C implements A, B{
    @Override
    public void fun(){
        System.out.println("Have a fun");
    }
    @Override
    public void fun2(){
        System.out.println("Have a fun2");
    }
}
//We can not do it because the java dose not support the multiple inheritanc
//through the class and inhertance as well as abstract class
//class A{
//
//}
//class B{
//
//}
//class C extends A ,B{
//
//}