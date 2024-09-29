package com.hsp.edu.chapter06;

public class Java09_Exception {

    public static void main(String[] args) throws Exception {

        // TODO - 异常
        String account = "admin";
        String password = "admin";
        try {
            login(account,password);
        } catch (AccountException accountException) {
            System.out.println("账号不正确，需要重新修正");
        } catch (PasswordException passwordException) {
            System.out.println("密码不正确，需要重新修正");
        } catch (LoginException loginException) {
            System.out.println("其他登录的相关错误，需要确认");
        }





    }

    public static void  login(String account,String password) throws LoginException {
        if (!"admin".equals(account)) {
            throw new AccountException("账号不正确");
        }
        if (!"admin".equals(password)) {
            throw new PasswordException("密码不正确");
        }
        System.out.println("登录成功");
    }

}

class AccountException extends LoginException {
    public AccountException(String message) {
        super(message);
    }
}

class PasswordException extends LoginException{
    public PasswordException(String message) {
        super(message);
    }
}

class LoginException extends Exception {
    public LoginException(String message) {
        super(message);
    }
}










