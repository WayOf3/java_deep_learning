package com.hsp.edu.chapter02;

public class Java04_Operator_1 {
    public static void main(String[] args) {

        // TODO 运算符
        // 数据参与运算的符号

        //等号其实就是赋值运算符，将等号右边表达式的结果赋值给等号右边的变量
        //复制运算符需要考虑类型的关系

//        String name ="zhangsan";
//        byte b = 10;
//        short s = b;

        // TODO 符合赋值运算符 +=
        // 如果元素进行运算后重新赋值给自己,那么久可以将运算和赋值的符号进行简化
        // 如果使用了复合赋值运算符，那么数据的类型不会发生变化.
//        int i = 1;
//        // i = i + 1
//        i += 1;
//        System.out.println(i);

        byte b1 = 10;
//        b1 = b1 + 20;
        b1 += 20;

        System.out.println(b1);





    }
}
