package com.StudentSystemPlus;

import java.util.ArrayList;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        System.out.println("学生管理系统------");
        System.out.println("请输入数字：1，等录；2，注册；3，忘记密码");
        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt()) {
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            case 3 -> System.out.println();
            default -> System.out.println("输入错误");
        }
    }

    //注册
    private static void register(ArrayList<User> users) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("输入用户名");
        String username = sc.next();


    }

    private static boolean checkUsername(String username) {
        //
        int length = username.length();
        if (length<3||length>15){
            System.out.println("请输入3-15位字符,重新输入");
            return false;
        }




        return true;
    }
}
