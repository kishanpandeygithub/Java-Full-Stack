package Array;

import java.sql.SQLType;

public class multiDimantional {
    public static void main(String[] args) {
//        int [][] marks = new int[3][3];
//        marks[0][0] = 23;
//        marks[0][1] = 25;
//        marks[0][2] = 45;
//        marks[1][0] = 24;
//        marks[1][1] = 65;
//        marks[1][2] = 34;
//        marks[2][0] = 54;
//        marks[2][1] = 64;
//        marks[2][2] = 87;
//
//        for(int row =0;row<marks.length;row++){
//            for(int col =0;col< marks[row].length;col++){
//                System.out.println(marks[row][col]);
//            }
//        }

//        int this column ara optiona
        int[][] marks = new int[3][];
        marks[0] = new int[1];
        marks[1] = new int[2];
        marks[2] = new int[3];

        marks[0][0] = 23;

        marks[1][0] = 24;
        marks[1][1] = 65;

        marks[2][0] = 54;
        marks[2][1] = 64;
        marks[2][2] = 87;
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col]+" ");
            }
            System.out.println();
        }

        int[] rollnumber ={1 ,2 ,3,4,5,6,7,8};
        for(int i =0;i< rollnumber.length;i++){
            System.out.println(rollnumber[i ]);
        }
    }
}
