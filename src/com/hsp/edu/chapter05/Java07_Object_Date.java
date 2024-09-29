package com.hsp.edu.chapter05;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Java07_Object_Date {

    public static void main(String[] args) throws Exception{

        // TODO 常见类和对象

        // 日历类

        Calendar instance = Calendar.getInstance();
//        System.out.println(instance);

        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DATE));
//        System.out.println(instance.get(Calendar.Day));

        char[] String;
        instance.setTime(new Date ());
//        System.out.println(instance.get(Calendar.YEAR));
//        System.out.println(instance.get(Calendar.MONTH));
//        System.out.println(instance.get(Calendar.DATE));
        instance.add(Calendar.YEAR,-1);
    }
}

