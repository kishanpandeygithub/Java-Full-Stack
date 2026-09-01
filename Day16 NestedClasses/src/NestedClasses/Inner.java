package NestedClasses;

public class Inner {
    public static void main(String [] args){
        //to create the object we can not use the Clasname diractly
        //we have to do like this
         Outer2 outer2 = new Outer2();
         Outer2.Inner2 inner2 = outer2.new Inner2();
         inner2.fun();
         //we can also do diractly like this
        Outer2.Inner2 inner3 = new Outer2().new Inner2();
        inner3.fun();
        inner3.fun3();
    }
}
class Outer2{
    int x =10;
    class Inner2{
        static void fun3(){
            System.out.println("HEzllo3");
        }
        int x =20;
        void fun(){
            System.out.println(Outer2.this.x);
            System.out.println("Hello World");
        }
    }
}
