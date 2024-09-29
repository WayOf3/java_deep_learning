package com.hsp.edu.chapter07;

import java.util.HashSet;
import java.util.concurrent.ArrayBlockingQueue;

public class Java10_Collection_Queue {

    public static void main(String[] args) throws InterruptedException {


        // TODO 集合 Collection Queue
        // ArrayBlockingQueue : Array + Blocking (阻塞，堵住) + Queue
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);

        // add 方法如果增加数据增加不了，直接发生错误
//        queue.add("zhangsan");
//        queue.add("lisi");
//        queue.add("wangwu");
//        queue.add("zhaoliu"); // 发生错误 Queue full

//        queue.put("zhangsan");
//        System.out.println("第一个人挂号");
//        queue.put("lisi");
//        System.out.println("第二个人挂号");
//        queue.put("wangwu");
//        System.out.println("第三个人挂号");
//        queue.put("zhaoliu");
//        System.out.println("第四个人挂号");

        boolean zhangsan = queue.offer("zhangsan");
        System.out.println(zhangsan);
        boolean lisi = queue.offer("lisi");
        System.out.println(lisi);
        boolean wangwu = queue.offer("wangwu");
        System.out.println(wangwu);
        boolean zhaoliu = queue.offer("zhaoliu");
        System.out.println(zhaoliu);

//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());

        System.out.println(queue.take());
        System.out.println(queue.take());
        System.out.println(queue.take());
        System.out.println(queue.take());

        queue.size();
        queue.isEmpty();
        queue.clear();

        System.out.println(queue);


    }

}




