package com.hsp.edu.chapter07;

import java.util.ArrayList;

public class Java03_Collection_ArrayList {

    public static void main(String[] args) {


        // TODO 集合 Collection - ArrayList
        // ArrayList的常用方法
        ArrayList list = new ArrayList();

        list.add("zhangsan");
        list.add("lisi");
        list.add("wagwu");
        list.add("zhangsan");
        list.add("zhangsan");

        // add 方法可以传递2个参数，第一个参数表示位置，第二个表示插入的值
//        list.add(1,"zhaoliu");

        ArrayList otherlist = new ArrayList();

        otherlist.add("1");
        otherlist.add("2");
        otherlist.add("3");

        list.addAll(otherlist);

        // size方法表示集合内部数据的数量
//        System.out.println(list.size());

        // 清空集合中的数据
//        list.clear();
        //删除指定集合中的数据
//        list.removeAll(otherlist);

        // 用于判断集合中是否存在某条数据，返回布尔类型的值
//        System.out.println(list.contains("zhangsan"));

        // 用于获取数据在索引中的第一个位置,如果数据不存在，那么返回-1
        // 最后一个位置
        System.out.println(list.indexOf("zhangsan"));
        System.out.println(list.lastIndexOf("zhangsan"));

        // 转数组
        Object[] array = list.toArray();
        // 赋值新集合
        Object clone = list.clone();
        ArrayList list1 = (ArrayList) clone;

        // 判断集合中的数据是否为空
        System.out.println(list.isEmpty());

        System.out.println(list);
        System.out.println(list1);


    }





}
