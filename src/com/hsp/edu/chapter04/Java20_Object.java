
package com.hsp.edu.chapter04;

public class Java20_Object {
    public static void main(String[] args) {

        // TODO 面向对象
        // Java中提供了一种语法，可以在数据初始化之后不被修改,使用关键字final
        // final 可以修饰变量: 变量的值一旦初始化后无法修改
        // final 可以修饰属性: 那么JVM无法初始化，需要自己进行初始化,属性值不能发生变化
        // 一般将final修饰的变量称之为常量，或者叫不可变变量
        // final 可以修饰方法，但是不可以被子类重写
        // final 可以修饰类，这样类就没有子类了
        // final 不可以修饰构造方法
        // final 可以修改方法的参数，一旦修饰，参数就无法修改


        final String name = "zhangsan";

        //System.out.println(name);

//        User20 user = new User20("wangwu");
        User20 user = new User20();
//        user.name = "zhangsan";
//        System.out.println(user.name);
//
//        user.name = "lisi";
//        System.out.println(user.name);
    }




}

final class User20 {

    public User20() {

    }

    public void test( final String name ) {
//        name = "lisi";

    }
//    public final String name ;
//
//    public User20(String name) {
//        this.name = name;
//    }
//
//    public final void test() {
//
//
//    }


}

//class Child20 extends  User20 {
//
////    public final void test() {
////
////
////    }
//}















