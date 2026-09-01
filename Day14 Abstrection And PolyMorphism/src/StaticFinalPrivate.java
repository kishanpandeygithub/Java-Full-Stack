public class StaticFinalPrivate {
    public static void main(String [] args){
        A a =new B();
        a.fun();
    }
}
//static keyword
//private
//final
class A{
    static void fun(){
        System.out.println("Hello");
    }
    private void fun2(){
        System.out.println("Hello@");
    }
    //they can not be hidden
    final void fun3(){
        System.out.println("Hello3");
    }
}
class B extends A{
    static void fun(){
        System.out.println("Bay");
    }
    private void fun2(){
        System.out.println("Bay2");
    }
//    @Override
//    void fun3(){
//        System.out.println("Bay3");
//    }
}
