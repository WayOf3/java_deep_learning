
package com.hsp.edu.chapter04;

public class Java18_Object {
    public static void main(String[] args) {

        // TODO 面向对象 - 外部类  - 内部类
        // Java 不允许外部类使用private , protected 修饰
        // 所谓的外部类，就是在源码中直接声明的类
        // 所谓的内部类，就是类中声明的类


        // 内部类就当成外部类的属性使用即可

        // 因为内部类可以看作外部类的属性，所以需要构建外部类对象才可以使用

        OuterClass out = new OuterClass();
        OuterClass.InnerClass innerClass = out.new InnerClass();

    }




}

class OuterClass {
    public  class InnerClass {

    }

}












