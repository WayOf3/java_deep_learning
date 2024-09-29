package com.hsp.edu.chapter07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Java09_Collection_Set {

    public static void main(String[] args) {


        // TODO 集合 Collection Set
        // Sort 排序

        // HashSet: Hash + Set
        // 散列函数 数据不能重复
        // ArrayList: 数组
        // LinkList : 链表

        HashSet set = new HashSet();

        // TODO 增加数据
        set.add("zhangsan");
        set.add("lisi");
        set.add("zhangsan");
        set.add("wangwu");

        // TODO 修改数据

        // TODO 删除数据
        set.remove("wangwu");

        // TODO 查询数据
        for (Object o : set) {
            System.out.println(o);
        }


        System.out.println(set);




    }

}



