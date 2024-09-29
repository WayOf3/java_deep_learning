package com.hsp.edu.chapter06;

public class Java05_Exception {

    public static void main(String[] args) {

        // TODO - 异常
        // 5.格式化异常：NumberFormatException
//        String s = "1a23";
//        Integer i = Integer.parseInt(s) ;

        // 6. 类型转换错误: java.lang.ClassCastException
        Object obj =  new User5();

        if ( obj instanceof Emp5 ) {
            Emp5 emp = (Emp5) obj;
        }



    }

}

class User5 {

}

class Emp5 {

}





