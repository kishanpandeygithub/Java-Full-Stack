package TypeConversion;

public class Typeconversion {
    public static void main(String[] args) {
//      type conversion
//      Implicit type conversion
//        byte b = 10;
//        int i = b;

//        explicit type conversion/
//        int i = 300;
//        byte b;
//        //b = i;//the type is converted to the int to byte give the erroe because of size
////        so we have to do the explicit type conversion
//        b= (byte)i;// 300%256

        //truncate type conversion
//        float f = 23.4433f;
//        int i =(int) f;//the answer is 23


        //type promotion in the java
//        the typepromotion is the technique use by the java to promothe the type of the variable
//        to prevent the intemidiry result of the varavles
         byte b = 50;
//         b =b*2;//this is give the error that can not convert the int to byte
//        so we have to do the eaplecitly
        b = (byte) (b*2);
        System.out.println(b);


    }
}
