package CatOffice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
 int[][] matrix = new int[9][9];
  int test =1;

        for (int i = 0; i < matrix.length; i = i+3) {
            for (int j = 0; j < matrix.length; j=j+3) {
                int countRow=0;
                for (int row = i; countRow<3 ; row++, countRow++) {
                    int countCol=0;
                    for (int col = j; countCol<3 ; col++, countCol++) {
                        matrix[row][col] = test;


                    }

                }
                test = 2;

            }
            test = 3;

        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]+"  ");
            }

            System.out.println();
        }



    }
}
