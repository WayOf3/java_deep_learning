package com.hsp.edu.chapter05;

public class Java09_Object {

    public static void main(String[] args) {

        // TODO 常见类和对象
        // 等于
        // 基本数据类型，双等号比较数值
//        int i = 10;
//        int j = 10;
//
//
//        System.out.println( i == j );
//        double d = 10.0;
//        System.out.println( i == d);
//
//        // 引用数据类型，双等号比较变量的内存地址
//        String s = "abc";  // 字符串常量池
//        String s1 = "abc";
//        String s2 = new String("abc");
//        System.out.println(s == s1);
//        System.out.println(s == s2);
//
//        // 引用数据类型
//        System.out.println(s.equals(s2));
//
//        User9 user1 = new User9();
//        User9 user2 = new User9();
//
//        System.out.println(user1 == user2);
//        System.out.println(user1.equals(user2));

        // 包装类型 判断相等也用equals
        // int => Integer => JVM为了操作，简化了很多操作
        // Integer缓存: -128 -127
        Integer i1 = Integer.valueOf(128);
        Integer i2 = Integer.valueOf(128);

        System.out.println( i1 == i2 );
        System.out.println( i1.equals(i2) );

    }
}


class User9 {

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

