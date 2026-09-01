package Method;

public class StringMethod {
    public static void main(String[] args){
        //we can left the empty constructor
//        String s0  =  new String();
        //first method
//        String s1 = "Ganesh";//string leteral(string pool)
//        System.out.println(s1);
//        String s2 = new String("Ganesh");//object (heap memory}
 //        System.out.println(s2);
        //method 3
//        String s3 ="Ganesh";
//        String s4 = new String(s3);
//        System.out.println(s4);
        //method 4
//        char[] arr ={'K','i','s','h','a','n',' ','P','a','n','d','e','y'};
//        String s5 =new String(arr);
//
        //method 5 we can use the indexing to select the String
//        String s6 =new String(arr , 0 ,6);
//        System.out.println(s6);

        byte[] arr2={97,98,99};
        String s7 = new String(arr2);
        System.out.println(s7);

        String s8 = new String(arr2 ,0 ,2);
        System.out.println(s8);

    }

}
