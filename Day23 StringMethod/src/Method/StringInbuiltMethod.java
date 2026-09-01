package Method;

public class StringInbuiltMethod {
    public static void main(String[] args){
        String s1 = new String("Kishansh");
        String s2 = new String("abd");
//        //length ans emptyness
//        System.out.println(s1.length());
//        System.out.println(s1.isEmpty());
//        System.out.println(s1.isBlank());
//
//        //charcterAccess
//        System.out.println(s1.charAt(2));
//        char[] arr = s1.toCharArray();
//        System.out.println(arr);
        //camparision
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s2.compareTo(s1));//retutn the ascii difference in that

        //searching
//        it take the char sequence
//        System.out.println(s1.contains("sh"));
//        System.out.println(s1.indexOf("sh"));
//        System.out.println(s1.lastIndexOf("sh"));
//        System.out.println(s1.startsWith("Ki"));
//        System.out.println(s1.endsWith("an"));

        //Extrection and transfommation
//        System.out.println(s1.substring(1 , 4));
//        System.out.println(s1.substring(1 ));
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.toLowerCase());
////        System.out.println(s1.trim());
//        System.out.println(s1.strip());//unicode friendly
//        System.out.println(s1.repeat(3));
//        System.out.println(s1.replace("i" , "A"));
//        System.out.println(s1.replace("ish" , "an"));
//        System.out.println(s1.replaceAll("sh" , "L"));

//        String s3 = "Kishan,Rohit,Rohan";
//        String[] srr= s3.split(",");
//        for(String s:srr){
//            System.out.println(s);
//        }
//        System.out.println(String.join("_" , srr));

        //conversion
//        String s4 = new String(String.valueOf(10));
//        System.out.println(s4);
//
//         byte[] arr = s1.getBytes();
//         for(byte i:arr){
//             System.out.println(i+" ");
//         }
         //advance method
//        intern();
//         String s5 = new String("Hello");
//         String s6 = s5.intern();
//         System.out.println(s5==s6);

        String name ="Kishan";
        int age = 28;
//        System.out.println("Hello "+" "+name+" "+" your age is "+age);
        System.out.println(String.format("Hello %s youtr age is %d" ,name , age));
    }
}
