package ExceptionHierarchy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {
    public static void main(String[] args) throws FileNotFoundException{

//        try{
//            readFile();
//        }
//        catch (FileNotFoundException f){
//            System.out.println("File not found Exception");
//        }

        //if main dose not want to handle it
        //but generally the main dose not use the throws f
        readFile();
    }
    private static void readFile() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
//    private static void readFile(){
//        //but we dont want to that
////        try{
////            FileReader fr = new FileReader("abc.txt");
////        }
////        catch (FileNotFoundException e){
////            System.out.println("FIle not found");
////        }
//    }
}
//check exception
