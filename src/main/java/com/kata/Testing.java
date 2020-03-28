package com.kata;

public class Testing {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9},
                         {1, 2, 3, 4, 5, 6, 7, 8, 9},
                         {1, 2, 3, 4, 5, 6, 7, 8, 9}};
//        int size = 3;
        int count = 0;
int array1[] = new int[3];
int array9[] = new int[9];
        int[][] sub = new int[3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3 ; j++) {
//                count++;

//                sub[3][9] = array[i][j];
                System.out.print(array[j][i] + " " + count++ + " ");
            }

            System.out.print(" ");
        }
    }
}
