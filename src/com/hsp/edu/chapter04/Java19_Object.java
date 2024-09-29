
package com.hsp.edu.chapter04;

public class Java19_Object {
    public static void main(String[] args) {

        // TODO 面向对象 - 单例模式 写代码的套路
        // JVM默认给类提供的构造方法，其实就是公共的，无参的构造方法
        // 1.类的创建过程复杂
        // 2.类的对象消耗资源
        // User19 user = new User19();

        User19 instance = User19.getInstance();
        User19 instance1 = User19.getInstance();
        User19 instance2 = User19.getInstance();
        User19 instance3 = User19.getInstance();
        User19 instance4 = User19.getInstance();
        User19 instance5 = User19.getInstance();
        User19 instance6 = User19.getInstance();

        System.out.println(instance1 == instance6); // 比较引用对象的地址
        System.out.println(instance1.equals(instance6)); // 比较引用对象的地址
        // 对象只有一个

    }




}

class User19 {

    private static User19 user19 = null;

    public User19() {

    }

    public static User19 getInstance() {
        // 静态方法不能访问成员属性 可以访问静态属性 成员方法可以访问静态属性

        if (user19 == null) {
            user19 = new User19();

        }

        return user19;
    }

}













