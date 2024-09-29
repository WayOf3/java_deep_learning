package com.hsp.edu.chapter05;


import java.util.Calendar;
import java.util.Date;

public class Java07_Object_Test {

    public static void main(String[] args) throws Exception{

        // TODO 常见类和对象
        // 打印当前日历
        System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日\t");

        // 获取当前日期的日历对象
        Calendar firstDate = Calendar.getInstance();

        // 先把日历对象设定为当前月的第一天
        firstDate.set(Calendar.DAY_OF_MONTH,1);



        // 获取当前月最大的日期 : 31
        int maxDay = firstDate.getActualMaximum(Calendar.DAY_OF_MONTH);


        for ( int i = 0;  i < maxDay; i++) {
            // 当前日期是周几
            int weekX = firstDate.get(Calendar.DAY_OF_WEEK);
            // 当前日期是几号
            int monthY = firstDate.get(Calendar.DAY_OF_MONTH);


            // 是一号的场合
            if ( i == 0 ){
                if ( weekX == Calendar.SUNDAY ) {
                    for ( int j = 0; j < 6; j++) {
                        System.out.println("\t");
                    }
                    System.out.println(monthY);
                } else {
                    // 周日是1，周一是2... 周六是7
                    for ( int j = 0; j < weekX - 2; j++ ){
                        System.out.print("\t");

                    }
                    System.out.print(monthY);
                    System.out.print("\t");
                }
            } else {
                // 不是一号的场合
                if ( weekX == Calendar.SUNDAY ) {
                    System.out.println(monthY);
                } else {
                    System.out.print(monthY);
                    System.out.print("\t");
                }
            }

            // 打印日历后应该增加一天
            firstDate.add(Calendar.DATE,1);
        }

        


    }
}

