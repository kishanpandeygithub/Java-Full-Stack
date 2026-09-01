package Input;
import java.io.IOException;
public class inputOutput {
    public static void main(String[] args) throws IOException{

//        this is the output
        System.out.println("Hello");
        System.err.println("Error message");

//        int val = System.in.read(int);
        int x = System.in.read();
        System.out.println((char) x);

    }
}
