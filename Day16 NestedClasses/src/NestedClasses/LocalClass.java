package NestedClasses;

public class LocalClass {
    public static void main(String[] args){
        Outer3 outer3 = new Outer3();
        outer3.greet();
    }
}
class  Outer3{
    static private  int x = 4;
    void greet(){
        //the variable should be the final or effictively final
        //it should not be modified
        int y =10;

        class Local{
            void Sayhello(){
                System.out.println("Hello in Local "+x+" "+y);
            }
        }

        Local local =new Local();
        local.Sayhello();
    }
}
