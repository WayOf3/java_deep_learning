package com.hsp.edu.chapter05;



public class Java02_Object {

    public static void main(String[] args) {

        // TODO 常见类和对象
        // 数组

        User1 user1 = new User1();
        User1 user2 = new User1();
        User1 user3 = new User1();
        User1 user4 = new User1();

        user1.test();
        user2.test();
        user3.test();
        user4.test();

        // 0 1 2 3
        User1[] user1s = new User1[4];
        for (int i = 0; i < user1s.length; i++) {
            user1s[i] = new User1();
        }

        for (int i = 0; i < user1s.length; i++) {
            user1s[i] .test();
        }

        // TODO 数组的声明方式: 类型[] 变量:
        // TODO 数组的创建: new 类型[容量]:
        String[] name = new String[3];

        //给数组的小格子添加数据,添加的方式为数组变量[索引] = 数据
        // 添加数据和访问数据时，索引是不能超过指定范围的(0 ~ length-1)
        name[0] = "zhangsan";
        name[1] = "lisi";
        name[2] = "wangwu";

        // 查询访问数据，访问的方式为: 数组变量[索引]
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);


        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

    }
}

class User1 {

    public void test(){

        System.out.println("test...");
    }
}
