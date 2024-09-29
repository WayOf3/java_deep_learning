package com.hsp.edu.chapter16_net_teacher;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddresTest {

    public static void main(String[] args) {
        // InetAddress类的一个实例代表一个具体的ip地址

        try {
            // 1.实例化
            // getByName(String host) : 获取指定ip对应的InetAddress的实例
            InetAddress inet1 = InetAddress.getByName("192.168.23.31");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);

            // getLocalHost(): 获取本地ip对应的InetAddress的实例
            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);

            InetAddress inet4 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet4);

//            // 2.两个常用的方法
//            System.out.println(inet1.getHostName());
//            System.out.println(inet1.getHostAddress());

            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }


    }
}
