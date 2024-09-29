package com.hsp.edu.chapter03;

public class Java05_FlowControl_1 {
    public static void main(String[] args) {

        // TODO 流程控制 - 循环执行
        for (int i = 0;i < 10;i++){
//            if (i == 4){
//
//            } else {
//                System.out.println(i);
//            }
            // break 关键字会直接跳出循环
            // continue 为跳过该次循环 直接执行下次循环
            if (i == 4){
                continue;
            }
            System.out.println(i);

        }


    }
}
