package com.hsp.edu.chapter07;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;

public class Java06_Collection {

    public static void main(String[] args) {


        // TODO 集合 Collection
        // 泛型语法
        ArrayList<Person6> list = new ArrayList();

//        Person6 user = new Usert6();
//        user.testUser();
//        user.testPerson();

        Person6 person = new Person6();
        Usert6 user = new Usert6();

        list.add(person);
//        list.add(user);

        list.remove(0);

        // 从集合中获取的对象类型为Object
//        Object o = list.get(0);
//
//        // 如果想要执行对象的方法，那么需要进行强制类型转换
//        if ( o instanceof Person6){
//            Person6 p = (Person6) o;
//            p.testPerson();
//        }

        Person6 person6 = list.get(0);
        person6.testPerson();

    }





}

class Person6 {
    public void testPerson() {
        System.out.println("person...");
    }

}

class Usert6 {
    public void testUser() {
        System.out.println("user...");
    }

}
