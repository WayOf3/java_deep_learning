package com.hsp.edu.chapter02;

public class Java04_Operator_3 {
    public static void main(String[] args) {

        // TODO 运算符  - 逻辑运算符
        // 与& 或| 非!
//        int i  = 10;
//        boolean result = (i<5) & (i<20); // 全真则为真
//        System.out.println(result);

        //短位与运算 &&
        // 如果第一个表达式的结果为false,那么就无需执行第二个表达式
//        int i  = 10;
//        int j = 20;
//        boolean result = (i>10) && (++j >30); // 全真则为真
//        System.out.println(result);
//        System.out.println(j);


        //短位与运算 || 短路或运算
        // 如果第一个表达式的结果为true,那么就无需执行第二个表达式
//        int i  = 10;
//        int j = 20;
//        boolean result = (i==10) || (++j >30);
//        System.out.println(result);
//        System.out.println(j);

        // TODO 逻辑非运算 相反运算
        int i = 10;
        boolean result = i == 10;
        System.out.println(!result);





    }
}
