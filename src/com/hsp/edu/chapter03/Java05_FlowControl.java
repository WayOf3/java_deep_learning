package com.hsp.edu.chapter03;

public class Java05_FlowControl {
    public static void main(String[] args) {

        // TODO 流程控制 - 循环执行
        // 根据条件重复执行某段代码
        // java中主要用于循环的语法有3个:
        // 1.while(条件) 有条件循环 {需要循环的代码}
        // 条件表达式结果为true 则循环 为false则退出循环
        int age = 30;
//        while ( age < 40 ) {
//            System.out.println("循环的代码");
//
//            age++;
//        }

        // 2. do... while
        // 语法执行原理和while语法基本相同，do while至少执行一次
        /*
        基本语法结构:
        do{
           循环代码
        } while (条件)
         */
//        do {
//            System.out.println("循环的代码");
//            age++;
//        } while (age < 40);

        // 3. for
        // 如果条件表达式返回的结果为false,那么跳过循环语句直接执行为后续代码
        // 初始化对条件表达式中用到的变量进行初始化
        // 循环代码执行后，会进行条件表达式的判断，如果结果为true会重复执行循环代码，false则退出
//        for (初始化表达式;条件表达式;更新表达式){
//              循环的代码
//        }
        for (int i = 0;i < 40;i++){
            System.out.println("循环的代码");
//
        }
        System.out.println("第二步");

    }
}
