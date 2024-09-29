package com.hsp.edu.chapter07;

import java.util.ArrayList;

public class Java03_Collection_List {

    public static void main(String[] args) {


        // TODO 集合 Collection -List

        // ArrayList  Array + List

        // 数组 + 列表
        // 顺序插入及存储

        // TODO 创建第一个集合对象：ArrayList
        ArrayList list = new ArrayList(3);

        // 1.不需要传递构造参数，直接new就可以，底层数字为空数组
        //2.构造参数需要传递一个int类型的值，用于设定底层数组的长度
        // 3.构造参数需要传递一个Collection集合类型的值，用于将其他集合中的数据放置在当前集合中

        // TODO 增加数据
        // add方法增加数据,只要将数据作为参数传递到add方法即可
        // 添加数据时，如果集合中没有任何的数据，那么底层会创建长度为10的数组
        // 容量不够会扩容

        list.add("zhangsan");
        list.add("zhangsan");
        list.add("wangwu");
        list.add("zhaoliu");

        // TODO 访问集合中的数据
        // 获取集合中数据的条数
        System.out.println(list.size());

        // 获取集合中指定位置的数据
        list.get(2);

        // 遍历集合中的数据
        for (int i = 0 ; i < list.size(); i++) {
            System.out.println("集合中的数据" + list.get(i));
        }

        // TODO 遍历集合中的数据 ,如果不关心数据的位置，可以采用特殊的for循环
        // for(循环对象:集合) {}
        for (Object obj : list) {
            System.out.println("集合中的数据" + obj);
        }
        
        // TODO 修改数据
        // 将指定位置的数据进行修改，set方法需要传递2个参数，第一个参数表示数据的位置，第二个参数修改的值.
        // 方法会返回结果，这个结果就是删除的值
        Object OldVal = list.set(1, "lisi");
        System.out.println(OldVal);

        // TODO 删除数组
        // 将指定位置的数据进行删除，remove方法需要传递1个参数，参数表示数据的位置
        // 方法会返回结果，这个结果就是删除的值
        Object removeVal = list.remove(1);
        System.out.println(removeVal);


        // TODO 打印集合对象
        System.out.println(list);

        System.out.println("main方法执行完毕");

    }





}
