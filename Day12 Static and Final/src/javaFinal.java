import javax.swing.*;
import java.rmi.Remote;

public class javaFinal {
    public static void  main(String[] args){
        Random r1 = new Random(3.14);
        System.out.println(r1.PI);
    }
}



class Random{
    final double PI ;
    Random(double PI){
        this.PI =PI;
    }
}
