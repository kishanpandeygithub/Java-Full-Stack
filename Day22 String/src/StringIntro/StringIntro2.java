package StringIntro;

public class StringIntro2{
    public static void main(String[] args){
        //problem of immutability
        String s ="";
        for(int i =0;i<5;i++){
            s+=i;
            System.out.println(s); 
        }
    }
}
