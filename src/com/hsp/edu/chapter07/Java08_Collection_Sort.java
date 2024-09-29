package com.hsp.edu.chapter07;

import java.util.ArrayList;
import java.util.Comparator;

public class Java08_Collection_Sort {

    public static void main(String[] args) {


        // TODO 集合 Collection
        // Sort 排序

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(2);

        // 排序需要传递一个实现了比较器接口的对象
        list.sort(new NumberComparator());


        System.out.println(list);


    }

}

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        // 如果返回负数，认为方法的第一个参数(即对象)应该排在前面

        // 如果返回正数，认为第二个参数应该排在前面

        // 如果返回0，认为谁放前面无所谓

        // 升序
//        if (o1 < o2) {
//            return -1;
//        } else if (o2 > o1) {
//            return 1;
//        } else {
//            return 0;
//        }

        // 降序
//        if (o1 < o2) {
//            return 1;
//        } else if (o2< o1) {
//            return -1;
//        } else {
//            return 0;
//        }

        // 移项得到下面

        // TODO 如果第一个数比第二个数要大，那么返回结果为正数，表示升序
        // return o1 - o2; // 升序
        // TODO 如果第一个数比第二个数要小，那么返回结果为负数，表示降序
        // return o2 - o1; // 降序
        // TODO 如果第一个数和第二个数一样大，那么返回结果为0
        return 0;

    }
}

