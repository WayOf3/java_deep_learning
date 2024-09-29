package com.hsp.edu.chapter06;

public class Java03_Exception {

    public static void main(String[] args) {

        // TODO - 异常
        // 1.除数为0的算术异常 java.lang.ArithmeticException
        // 运行期异常
//        int i = 0;
//        if ( i!= 0) {
//            int j = 10 / i;
//        }

        // 2 : 空指针异常 java.lang.NullPointerException
        // 调用了一个为空(null)对象的成员属性或成员方法时，就会发生异常
        User3 user = null;
//        if ( user != null ) {
//            System.out.println(user.toString());
//        }


        try {
            System.out.println(user.toString());
        } catch (NullPointerException e) {
            System.out.println("对象为空,需要分析数据为空的原因");
        }








    }

}

class User3 {

    public static String name = "zhangsan";

}



