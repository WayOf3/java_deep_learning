package com.hsp.edu.chapter05;



public class Java03_Object_Test {

    public static void main(String[] args) {

        // TODO 常见类和对象
        // 二维数组

        /*

        九层妖塔
          *
         ***
        *****

         */

        int row = 9;
        int col =  2 * (row - 1) + 1;
        String[][] nineTower = new String[row][col];

        for ( int i = 0;i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ( j >= ( row -1 ) - i && j <= ( row -1 ) + i) {
                    nineTower[i][j] = "*";
                } else {
                    nineTower[i][j] = " ";
                }

            }
        }


        for ( int i = 0;i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(nineTower[i][j]);
            }

            System.out.println();
        }


    }
}

