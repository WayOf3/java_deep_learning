package com.hsp.edu.chapter02;

public class Java04_Operator {
    public static void main(String[] args) {

        // TODO 运算符
        // 数据参与运算的符号


        // TODO 表达式
        //运算符和数据连接

        //算术运算符
        //1.二元运算符：两个元素参与运算的运算符 1+2
        // TODO 算术表达式 = 元素1 二元运算符 元素2
        // 这个表达式是有结果的，就需要有类型，这里的类型是元素中类型最大的那一种,最小使用类型为int类型
        System.out.println(1 + 2);
        System.out.println(2 - 2);
        System.out.println(3 * 2);
        System.out.println(4 / 2);
        System.out.println(1 / 2); // (int,int) => int
        System.out.println(1.0 / 2); // (double,int) => int
        System.out.println(5 % 2);

        //2.一元运算符： 一个元素参与运算的运算符
        byte b1 = 10;
        byte b2 = 20;
//        byte b3 = (byte) (b1 + b2);

        System.out.println(1 + 2  * 3);
        System.out.println((1 + 2)  * 3);

        // 2.一元运算符 ：一个元素参与运算的运算符
        // ++,--
        // ++ 运算符的本质其实就是加1操作的简化版本,自增运算符
        // -- 运算符的本质其实就是加1操作的简化版本,自减运算符
//        int i = 0;
//        int j = i;  // j = 0
//        i = i+1;  // i = 1
//        int j = i++;
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);

        int i = 0;
//        i = i + 1;
//        int j = i;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);






    }
}
