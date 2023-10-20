package com.heima.stringDemo.test;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String rightUsername="zhangsan";
        String rightpassword="123456";


        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入账号：");
            String username = sc.next();
            System.out.print("请输入密码：");
            String password = sc.next();
            if (username.equals(rightUsername)){
                if (password.equals(rightpassword)){
                    System.out.println("登录成功");
                    break;
                }else {
                    System.out.println("密码错误,还剩"+(i+1)+"次");
                }
            }else {
                System.out.println("用户名错误");
            }
        }

    }
}
