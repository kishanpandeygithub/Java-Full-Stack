package JavaFunction;

public class FunctionIntro {
    public static void main(String[] args) {
        //function
//        function is the block of the code that can use it anywhere
        //the syntex of the function
        //accessmodifier return_type name (parameters){
        // code part
        //}
//        System.out.println(sum(2 ,3));
       /* FunctionIntro f = new FunctionIntro();
        int ans = f.sum(2 , 4);
        System.out.println(ans);*/

//        access modifiers in the java
         /*
         * public: accessible from anywhere
         * private: accessible only within the class
         * protacted: accessible in the same package + subclass and even in the different package
         * default: accessible in only in the same package
         * */

        //method calling in the class
        //instace method require an object to be called
//        FunctionIntro f =new FunctionIntro();
//        System.out.println(f.sum(1 , 3));

        //static method
        //static method are called br the class name but only an
        //static method can call the another static method
//        System.out.println(FunctionIntro.publicMethod(2 ,3));
//        System.out.println(publicMethod(3 ,5));

//        types of the method
        greet();
        sum(2 ,3);
        System.out.println(getNumber());
        System.out.println(sum(2 ,3 ,4));
    }

    //without input and the output
    static void greet(){
        System.out.println("Hello");
    }

//    with  input and without output
    static  void  sum(int a ,int b){
        System.out.println(a+b);
    }

    //without input and woth output
    static  double  getNumber(){
        return Math.random();
    }
    //with input and with output
    static  int sum(int a ,int b ,int c){
        return a+b+c;
    }




//    static public int publicMethod(int a , int b){
//        return a+b;
//    }
//    private int privateMethod(int a , int b){
//        return a+b;
//    }
//    protected int protactedMethod(int a , int b){
//        return a+b;
//    }
//    int sum(int a ,int b){
//        return a+b;
//    }
}
