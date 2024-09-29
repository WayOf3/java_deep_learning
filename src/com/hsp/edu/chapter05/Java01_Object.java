package com.hsp.edu.chapter05;

public class Java01_Object {

    public static void main(String[] args) {

        // TODO 常见类和对象
        // java.lang.object: 对象
        Object obj = new Person(); // 子类对象在父类中使用

        // 将对象转换成字符串
        // at  toString 默认打印的就是对象的内存地址,所以，为了能更直观理解对象的内容,所以可以重写这个方法
        String s = obj.toString();
        System.out.println(s);

        // TODO 获取对象的内存地址
        int i = obj.hashCode();
        System.out.println(i);

        // TODO 判断两个对象是否相等，如果相等，那么返回true,否则返回false
        // equals 方法 比较对象时，默认比较就是内存地址
        Person otherPerson = new Person();
        System.out.println(otherPerson.hashCode());
        System.out.println(obj.equals(otherPerson));

        // getClass获取对象的类型信息
        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getPackage().getName());
    }
}

class Person {

    public String name = "zhangsan";
//    @Override
//    public String toString() {
//        return "Person["+name+"]";
//    }


    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
class User extends Person{

}
