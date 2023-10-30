package com.StudentSystemPlus;

import java.util.ArrayList;
import java.util.Scanner;

public class UserNameDemo {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        addname(users);
        User user = users.get(0);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getPersonid());
        System.out.println(user.getPhoneNumber());
    }

    //注册
    public static void addname(ArrayList<User> users) {
        //用户名校验
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名：");
        String username = sc.next();
        int length = username.length();
        if (length < 3 || length > 15) {
            System.out.println("请输入3-15位字符,请重新输入");
            return;
        }
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                    count++;
                }
            } else {
                System.out.println("请输入大小学英文字母和数字组成的用户名");
                return;
            }
        }
        if (count == 0) {
            System.out.println("不能使用纯数字");
            return;
        }
        System.out.println("输入密码：");
        String password1 = sc.next();
        System.out.println("确认密码：");
        String password2 = sc.next();
        if (password1.equals(password2)) {

        } else {
            System.out.println("密码错误重新输入");
            return;
        }
        System.out.println("输入身份证号：");
        String personid = sc.next();
        if (idNum(personid)) {
        } else {
            System.out.println("身份证号码错误重新输入");
            return;
        }
        System.out.println("输入手机号：");
        String phonenumber = sc.next();
        if(number(phonenumber)){

        }else {
            System.out.println("手机号码错误重新输入");
            return;
        }
        User user = new User(username, password1, personid, phonenumber);
        users.add(user);
    }
    //登录









    //手机号格式判断
    public static boolean number(String phonenumber) {
        int length = phonenumber.length();
        //不能为空
        if(phonenumber==null){
            return false;
        }
        //必须11位
        if (length != 11) {
            return false;
        }
        //首位不能为0
        if (phonenumber.charAt(0)=='0'){
            return false;
        }
        //必须全是数字
        for (int i = 0; i < length; i++) {
            char c = phonenumber.charAt(i);
            if (c>='0'&&c<='9'){
            }else {
                return false;
            }
        }
        return true;
    }

    //身份证号格式判断
    public static boolean idNum(String id) {
        if (id == null) {
            return false;
        }
        if (id.length() != 18) {
            return false;
        }
        //判断第一位是否为零
        if (id.startsWith("0")) {
            return false;
        }

        for (int i = 1; i < id.length(); i++) {
            //string.charAt此方法返回的是char类型
            char c = id.charAt(i);
            //判断最后一位是否是除了X和数字
            if (i == id.length() - 1) {
                if (c < '0' || c > '9' && c != 'X') {
                    return false;
                }
            } else {
                //其他位数字判断
                if (c < '0' || c > '9') {
                    return false;
                }
            }
        }
        return true;
    }
}
