package com.hsp.edu.chapter05;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Java06_Object_Date {

    public static void main(String[] args) throws Exception{

        // TODO 常见类和对象
        // Date: 日期类
        // 时间戳: 毫秒
        System.out.println(System.currentTimeMillis());
        // Date: 日期类
        // Calendar: 日历类

        Date d =  new Date();
        System.out.println(d);


        // Java 格式化日期格式
        // y(Y) -> 年 -> yyyy
        // m(MM) -> MM : 月份 m: 分钟
        // d(D) -> dd：一个月中的日期, D: 一年中的日期
        // h(H) -> h: 12进制 H:24 进制
        // s(S) -> s:秒 ，S : 毫秒

        // Date -> String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormatString = sdf.format(d);
        System.out.println(dateFormatString);

        // String -> Date
        String dateString = "2022-06-01";
        Date parseDate = sdf.parse(dateString);
        System.out.println(parseDate);

        // 根据时间戳构建指定的日期对象
//        d.setTime(System.currentTimeMillis());
        // 获得时间戳
//        d.getTime();

        System.out.println(parseDate.before(d));
        System.out.println(parseDate.after(d));
    }
}

