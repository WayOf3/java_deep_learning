package com.hsp.edu.chapter04;

public class Java06_Object_Method {
    public static void main(String[] args) {

        // TODO 面向对象 -方法
        // 声明的语法： void 方法名 () {逻辑代码}
        // 声明的语法： 方法的返回值类型[void] 方法名 () {逻辑代码}
        // void 表示没有结果
        // 方法的调用方式 对象.方法名()

        // 使用用户账号和密码进行登录

        // 名词 : 用户 账号 密码

        // 动词: 登录

        User06 user = new User06();
        boolean registerResult = user.register();
        if (registerResult) {
            System.out.println("注册成功");
            Boolean loginResult = user.login();
            if (loginResult) {
                System.out.println("登陆成功");
            } else {
                System.out.println("登录失败");
            }
        } else {
            System.out.println("注册失败");
        }


    }
}

class  User06 {

    String account;

    String password;

    boolean  register() {
        System.out.println("用户注册");
        // 返回结果 false
        return true;
    }

    Boolean login () {
        System.out.println("用户登录");
        return true;
    }

}



