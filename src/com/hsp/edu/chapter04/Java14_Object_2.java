
package com.hsp.edu.chapter04;

public class Java14_Object_2{
    public static void main(String[] args) {

        // TODO 面向对象 - 多态
        byte b = 10;
        test(b);

        // 基本数据类型在匹配方法时，可以在数值不变的情况下，扩大数据的精度

        // byte 类型无法和char类型做转换，char没有负数，但是byte存在负数

    }
//    static void test(byte b) {
//        System.out.println("bbb");
//    }

    static void test(short s) {
        System.out.println("sss");
    }

    static void test(char c) {
        System.out.println("ccc");
    }

    static void test(int i) {
        System.out.println("iii");
    }
}





