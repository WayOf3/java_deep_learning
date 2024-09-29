package com.hsp.edu.chapter07;

import java.util.ArrayList;
import java.util.LinkedList;

public class Java05_Collection_LinkedList {

    public static void main(String[] args) {


        // TODO 集合 Collection - LinkedList
        // LinkedList :Linked (连接) + List
        // LinkedList的常用方法

        // 构建集合对象
        LinkedList list = new LinkedList();

        // 增加第一个数据
        list.add("zhangsan");
        list.add("lisi");
        list.add("wagwu");
//        list.addFirst("lisi");
//        list.add(1,"wangwu");



        // TODO 获取数据
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());


        // TODO 获取数据(遍历数据)
//        System.out.println(list.get(1));

//        for (int i = 0 ; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for ( Object obj : list) {
//            System.out.println(obj);
//        }

        // TODO 修改数据
//        list.set(1,"zhaoliu");

        // TODO 删除数据
        list.remove("zhangsan");


        // TODO 打印集合数据
        System.out.println(list);




    }





}
