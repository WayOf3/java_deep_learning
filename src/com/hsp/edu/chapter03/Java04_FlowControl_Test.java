package com.hsp.edu.chapter03;

public class Java04_FlowControl_Test {
    public static void main(String[] args) {

        // TODO 流程控制 - 分支执行
        int age = 30;
        // 儿童(0-6),少年（7-17），青年(18-40),中年(41-65),老年(66)
        if ( age >= 0 && age <= 6 ){
            System.out.println("儿童");
        } else if ( age < 18 ) {
            System.out.println("少年");
        } else if ( age < 41 ) {
            System.out.println("青年");
        } else if ( age <=66 ) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }

    }
}
