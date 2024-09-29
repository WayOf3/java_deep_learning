package com.hsp.edu.chapter07;

import java.util.ArrayList;
import java.util.HashSet;

public class Java09_Collection_Set_1 {

    public static void main(String[] args) {


        // TODO 集合 Collection Set


        HashSet set = new HashSet();

        ArrayList list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        set.addAll(list);

        Object[] array = set.toArray();
        System.out.println(set.isEmpty());
//        set.clear();
        set.contains("zhangsan");
        System.out.println(set.size());
        Object clone = set.clone();
        System.out.println(clone);


        System.out.println(set);






    }

}



