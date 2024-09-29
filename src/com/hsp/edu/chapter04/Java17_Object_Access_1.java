
package com.hsp.edu.chapter04;

public class Java17_Object_Access_1 {
    // shift + shift 查找任何类
    public static void main(String[] args) throws CloneNotSupportedException {

        Person17 person = new Person17();
        Java17_Object_Access_1 ja = new Java17_Object_Access_1();
        ja.clone();

        // private : 同类
        // default : 同类 同包(路径)
        // protected : 同类 同包(路径),子类
        // public : 公共
        // 所谓的访问权限，其实就是访问属性，方法的权力限制
        // 谁访问 Java17_Object_Access_1 -> super -> java.lang.Object
        // 访问谁的 Person17 -> super Java.lang.object(clone)

//        person.clone();

    }
}

class Person17  {

    void test() throws Exception{
         clone();
    }
}












