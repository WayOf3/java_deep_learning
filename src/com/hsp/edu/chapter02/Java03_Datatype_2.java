package com.hsp.edu.chapter02;

public class Java03_Datatype_2 {
    public static void main(String[] args) {

        // TODO 数据类型的转换

        String name = "zhangsan";
        int age = 30;

        name = "lisi";
//        name = age;
        // byte ->short->int->long -> float ->double
        byte b = 10;

        short s = b;

        int i = s;

        long lon = i;

        float f = lon;

        double d = f;

        // java中范围小的数据可以直接转换为范围大的数据，但是大的数据无法直接转换为范围小的数据
        //如果范围大的数据想要转换为小的，需要用到强制转换
        int i1 = (int) d;




    }
}
