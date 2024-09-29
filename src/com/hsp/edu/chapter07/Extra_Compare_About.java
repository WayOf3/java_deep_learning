package com.hsp.edu.chapter07;

import java.io.Serializable;
import java.util.Comparator;

public class Extra_Compare_About {
    public static void main(String[] args) {
        User u1 = new User("李白", 20);
        User u2 = new User("杜甫", 40);

        System.out.println(u1.compareTo(u2));
    }
}

class User implements Comparable<User>, Comparator<User>, Serializable {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {

        // Integer return compare(this.value, anotherInteger.value);
        // public static int compare(int x, int y) {
        //        return (x < y) ? -1 : ((x == y) ? 0 : 1);
        //    }
        // compareTo方法返回int型的负数、0、正数，分别代表小于、等于、大于指定的对象


//        return this.getAge().compareTo(o.getAge());

        // User类同时实现Comparator<User>,Comparable<User> 两个接口后 模仿Integer
        // 2种实现方式可以相互调用，不过总要有一个方法去写实现，如果2个方法相互调用且都不写实现的话，那就呵呵了，最终就是相互调用到死，StackOverflow了。
        return this.compare(this, o);

    }

    @Override
    public int compare(User o1, User o2) {
        return (o1.getAge() < o2.getAge()) ? -1 : ((o1.getAge() > o2.getAge()) ? 1 : 0);
    }
}
