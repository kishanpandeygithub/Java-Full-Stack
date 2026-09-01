package function;

public class Intro {

    //in the java there is 4 type of function
    //no parameter and no return typa
    static void greet() {
        System.out.println("Hello Kishan pandey");
    }

    //no parameter with return type
    static int Number(){
        return 10;
    }
    //with parameter with return type
    static int sum(int a ,int b){
        return a+b;
    }
    //we can also introduce the function ovelloading in  the java
    //the main task in the overloading id that
    //we have to change the type of parametr , or change the order of the parameter  , or change the numer of parameter
    static int sum(int a ,int b ,int c){
        return  a+b+c;
    }
    static double sum(double a ,double b){
        return  a+b;
    }
    //with parameter no return type
    static void Sayhello(String Name){
        System.out.println("Hello "+ Name);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        //calling the function
        greet();
        System.out.println(Number());
        System.out.println(sum(a , b));
        System.out.println(sum(a , b , 30));
        System.out.println(sum(1.2 , 3.4));
        Sayhello("Kishan");
    }
}
