
package com.hsp.edu.chapter04;

public class Java14_Object_3 {
    public static void main(String[] args) {

        // TODO 面向对象 - 多态
//        AAA aaa = new AAA();
//        BBB aaa = new BBB();
        BBB aaa = new BBB();

        test(aaa);

        // 多态其实就是约束了对象的使用场景
        // 方法的重载： 方法名相同，参数列表不同(个数，顺序，类型)
        // AAA -> object
        // BBB -> AAA

    }
    static void test(AAA aaa) {
        System.out.println("aaa");
    }

//    static void test(BBB aaa) {
//        System.out.println("bbb");
//    }



}

class  AAA {

}
class  BBB  extends  AAA{

}





