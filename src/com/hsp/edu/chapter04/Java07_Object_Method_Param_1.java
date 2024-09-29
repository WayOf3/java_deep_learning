package com.hsp.edu.chapter04;

public class Java07_Object_Method_Param_1 {
    public static void main(String[] args) {

        // TODO 面向对象 -方法
//        String s = "abc";
//        test(s);
//        System.out.println(s);  // abc

        User user = new User();
        user.name = "zhangsan";
        test(user);
        System.out.println(user.name);
    }

//    public static void test(int i) {
//        i = i + 10;
//    }

        public static void test(User user) {
            user.name = "lisi";
    }
}

class User {
    String name;
}





