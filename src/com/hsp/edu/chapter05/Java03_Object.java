package com.hsp.edu.chapter05;



public class Java03_Object {

    public static void main(String[] args) {

        // TODO 常见类和对象
        // 数组
//        double [] nums = new double[3];
//        for (double num : nums) {
//            System.out.println(num);
//        }


//        String[]  names = { "zhangsan","lisi","wangwu" };
//        System.out.println(names);
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        System.out.println(names.length);


        // 二维数组
//        String[][] names = {{"zhangsan","lisi","wangwu"},{"wangwu"},{"wangwu"}};
        // 标准二维数组
        String[][] names = new String[3][3];
        names[0][1] = "zhangsan";

//        System.out.println(names[0][1]);

        for ( int row = 0;row < 3;row ++) {
           for (int col = 0; col < 3; col ++) {
               System.out.println(names[row][col]);
           }


        }



    }
}

