package com.hsp.edu.chapter03;

public class Java06_FlowControl_Test {
    public static void main(String[] args) {

        // TODO 流程控制 - 小练习
        // 九层妖塔
        /*
          *
         ***
        *****
       *******
         */
        int level = 3;
        for (int i = 0; i < level;i++){
            for (int j = 0; j < (level - 1) - i; j++){
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }


        }



}

