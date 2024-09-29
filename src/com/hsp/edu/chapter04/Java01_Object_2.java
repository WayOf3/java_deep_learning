package com.hsp.edu.chapter04;

public class Java01_Object_2 {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.name = "张三";
        t.teach();

        Student s = new Student();
        s.name = "李四";
        s.study();

        Java17_Object_Access user = new Java17_Object_Access();
        System.out.println(user.sex);

    }
}

class Teacher {
    String name;
    void teach () {
        System.out.println(name + "老师在讲课");
    }
}
class Student {

    String name;
    void study () {
        System.out.println(name + "学生在听课");
    }
}

