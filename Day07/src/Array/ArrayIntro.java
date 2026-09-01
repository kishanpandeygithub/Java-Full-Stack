 package Array;

public class ArrayIntro {
    public static void main(String[] args){
        //this aray is the 3 size array
//        int[] rollNums = new int[3];
//        rollNums[0] = 101;
//        rollNums[1] = 102;
//        rollNums[2] = 103;
//
//        System.out.println(rollNums[0]);
//        System.out.println(rollNums[1]);
//        System.out.println(rollNums[2]);
        //declaration through loop
        int[] rollNumber = new int[5];
        int x =101;
        for(int i =0;i< rollNumber.length;i++){
            rollNumber[i] =x;
            x++;
        }for(int i =0;i< rollNumber.length;i++){
            System.out.println(rollNumber[i]);
        }
    }
}
