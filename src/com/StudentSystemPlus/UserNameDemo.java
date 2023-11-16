package com.StudentSystemPlus;

import com.StudentSystem.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserNameDemo {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1，注册；2，登录；3，忘记密码");
            int i = sc.nextInt();
            switch (i) {
                case 1 -> addname(users);
                case 2 -> login(users);
                case 3 -> System.out.println("忘记密码");
                case 4 -> {
                    System.out.println("系统退出");
                    System.exit(0);
                }
                default -> System.out.println("重新输入");
            }
        }
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
        int index = nameinof(users, username);
        if (index >= 0) {
            System.out.println("用户名重复，请重新输入");
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
        if (number(phonenumber)) {

        } else {
            System.out.println("手机号码错误重新输入");
            return;
        }
        User user = new User(username, password1, personid, phonenumber);
        users.add(user);
    }

    //登录
    public static void login(ArrayList<User> users) {
        //录入账号判断是否存在
        Scanner sc = new Scanner(System.in);
        System.out.print("输入用户名：");
        String username = sc.next();
        int index = nameinof(users, username);
        if (index == -1) {
            System.out.println("账号不存在，请注册");
            return;
        }
        //录入密码,有三次输入机会
        //
        for (int i = 0; i < 3; i++) {
            System.out.print("输入密码：");
            String password = sc.next();
            if (users.get(index).getPassword().equals(password)) {
                System.out.println();
                break;
            } else {
                if (i == 2) {
                    System.out.println("密码错误次数过多，稍等再试");
                    return;
                }
                System.out.println("请输入正确的密码，您还有" + (2 - i) + "次机会。");
            }
        }
        //获取一个验证码，随机
        //
        Random random = new Random();
        char[] chars = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        yanzheng:
        while (true) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                int i1 = random.nextInt(chars.length);
                sb.append(chars[i1]);
            }
            String yzm = sb.toString();
            System.out.println("验证码是：" + yzm);
            //录入验证码
            System.out.print("请输入验证码：");
            String yzm2 = sc.next();
            if (yzm.equals(yzm2)) {
                break yanzheng;
            } else {
                System.out.println("验证码错误,重新输入");
            }
        }
        //登录成功
        System.out.println("登录成功！");
    }

    //忘记密码
    public static void setPassword(ArrayList<User> users) {
        //1.录入用户名，如果不存在提示未注册
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("输入用户名：");
        String username = sc.next();
        int index = nameinof(users, username);
        if (index == -1) {
            System.out.println("账号不存在，请注册");
            return;
        }
        //2.验证身份证号和手机号，
        //
        System.out.print("Please input personid：");
        String personid1 = sc.next();
        System.out.print("Please input PhoneNumber：");
        String PhoneNumber1 = sc.next();
        String personid = users.get(index).getPersonid();
        String PhoneNumber = users.get(index).getPhoneNumber();
        if (personid.equals(personid1) && PhoneNumber.equals(PhoneNumber1)) {
            System.out.println("验证通过，请输入密码");
        } else {
            System.out.println("验证失败，请重试");
            return;
        }

        //3.输入密码
        users.get(index).setPassword(sc.next());

    }

    //手机号格式判断
    public static boolean number(String phonenumber) {
        int length = phonenumber.length();
        //不能为空
        if (phonenumber == null) {
            return false;
        }
        //必须11位
        if (length != 11) {
            return false;
        }
        //首位不能为0
        if (phonenumber.charAt(0) == '0') {
            return false;
        }
        //必须全是数字
        for (int i = 0; i < length; i++) {
            char c = phonenumber.charAt(i);
            if (c >= '0' && c <= '9') {
            } else {
                return false;
            }
        }
        return true;
    }

    //判断字符串再集合中是否存在，存在返回索引，不存在返回-1
    public static int nameinof(ArrayList<User> users, String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(name)) {
                return i;
            }
        }
        return -1;
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
