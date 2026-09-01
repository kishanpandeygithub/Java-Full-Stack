package Input;
import java.io.*;
import java.util.Scanner;
public class INput {
    public static void main(String[] args) throws IOException  {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br =new BufferedReader(isr);
//
//        String name =br.readLine();
//        System.out.println(name);

        //now to simplyfy the input and the output the java provide the scanner class
        Scanner sc = new Scanner(System.in);
        //these ate the string method
//        String s = sc.next();//read only a word
//        String s = sc.nextLine();//read the whole line until we press the enter
        //these are the integer method
//        int age = sc.nextInt();
        //these are the double method
        double price = sc.nextDouble();
        System.out.println(price);

//        for other we write only
//        sc.next_____()
    }

}
