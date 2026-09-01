package FlowControl;

public class Loops {
    public static void main(String[] args) {
        //iteration statement allow the statement to repeat a block of code multiple time
        //while loop
        //while loop is used when the number of iteration is known
//        int i =20;
//        while(i>0){
//            System.out.println(i);
//            i--;//if we do not writhe the tremination conditon that couse the infinite loop
//        }
////        do while loop:it run at least one time before checking the condition
//        int j = 1;
//        do{
//            System.out.println(j);
//            j++;
//        }while(j<20);

//        for loop
//        for(int i =0;i< 10;i++){
//            System.out.println(i);
//        }
////        we can also use the comma seperated variation
//        for(int j = 0 , i =20;j<i;j++ ,i--){
//            System.out.println(j);
//        }
//
/////////Enhenced for loop
//        int[] num ={2 ,3 ,4 ,5 ,6};
//        for(int val:num){
//            System.out.println(val);
//        }
        //break and continue
        // break  and the continue is the jump statement which is used tho break the loop or left the vurrent iteration
        //prime number
//        int i;
//        int p =18;
//        for( i =2;i< p;i++){
//            if(p%i==0) {
//                System.out.println("The Number is not Prime");
//                break;
//            }
//        }
//        if(i==p){
//            System.out.println("The number is prime");
//        }

        //lables

//        we can name the loops is called lables
        outer:
        for (int i = 0; i < 5; i++) {
            inner:
            for (int j = 0; j < i; j++) {
                System.out.print('*');
                if(i==2){
                    break outer;
                }
            }
            System.out.println();
        }

    }


}
