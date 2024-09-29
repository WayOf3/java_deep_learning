package com.hsp.edu.chapter02;

public class VarDetail {
    public static void main(String[] args) {

        //变量必须先声明，后使用，即有顺序
        //变量=变量名+值+数据类型 变量三要素
        int a = 50;//int
        System.out.println(a); // 50
        //该区域的数据/值可以在同一类型范围内不断变化
        // a = "jack" //x
        a = 88;//x
        System.out.println(a);//88

        //变量在同一个作用域内不能重名
        //int a = 77;//错误

        // java整型常量默认为int型，声明long型常量须后加l或L
        int n1 = 1;
        Long n3 = 1L;

        //java的浮点型常量(具体值)默认为double型，声明float型常量,须后加'f'或'F'
        float num1 = 1.1F;
        double num3 = 1.1;
        double num4 = 1.1f;

        //十进制数形式: 如5.12 512.0f .512
        double num5 = .123;
        System.out.println(num5);
        System.out.println(5.12e2);
        System.out.println(5.12e-2);

        //推荐double 比float更精准
        // 使用陷阱 2.7 和 8.1 / 3
        double num6 = 2.7;
        double num7 = 8.1 / 3;
        System.out.println(num6);
        System.out.println(num7);
        //运算后的小数相等判断要小心
        //应该是以两个数的差值的绝对值，在某个精度范围内判断
        if (num6 == num7){
            System.out.println("相等");
        }
        //正确的写法 ctrl + / 注释快捷键 再次输入取消注释
        if (Math.abs(num6 - num7) < 0.001){
            System.out.println("差值非常小，到我的规定精度，认为相等...");
        }
    }
}

class Dog{
    public static void main(String[] args) {
        int a = 666;
    }
}
