
package com.hsp.edu.chapter04;

public class Java16_Object_Recursion {
    public static void main(String[] args) {

        // TODO 面向对象 - 递归

        // 所谓的递归，方法调用自身,称之为递归

        int result = function(9);
        System.out.println(result);

        int result2 = function2(5);
        System.out.println(result2);

        //1.递归方法应该有跳出的逻辑 可能会栈溢出
        // 2. 调用自身时，传递的参数要有规律

    }

    // 阶乘 ： 5！ => (4,3,2,1) => 5 * 4 * 3 * 2 * 1
    // 0的阶乘为1 0! = 1

    public static int function2 (int x) {


        if ( x <= 1 ) {
            return 1;
        } else {
            return x * function2(x-1);
        }

    }

    // 奇数之和
    public static int function (int x) {

        x = x % 2 == 0 ? x - 1 : x;
        if ( x == 1) {
            return 1;
        } else {
            return x + function(x-2);
        }

    }
}












