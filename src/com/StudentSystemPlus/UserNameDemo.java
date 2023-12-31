package com.StudentSystemPlus;

import com.StudentSystem.Student;
import com.StudentSystem.StudentDemo;

import java.util.ArrayList;
import java.util.Queue;
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
                case 3 -> setPassword(users);
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
        String username = null;
        while (true) {
            System.out.println("输入用户名：");
            username = sc.next();
            int length = username.length();
            if (length < 3 || length > 15) {
                System.out.println("请输入3-15位字符,请重新输入");
                continue;
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
                    continue;
                }
            }
            if (count == 0) {
                System.out.println("不能使用纯数字");
                continue;
            }
            int index = nameinof(users, username);
            if (index >= 0) {
                System.out.println("用户名重复，请重新输入");
                continue;
            }
            break;
        }
        String password1 = null;
        while (true) {
            System.out.println("输入密码：");
            password1 = sc.next();
            System.out.println("确认密码：");
            String password2 = sc.next();
            if (password1.equals(password2)) {
                break;
            } else {
                System.out.println("密码错误重新输入");
                continue;
            }
        }
        String personid = null;
        while (true) {
            System.out.println("输入身份证号：");
            personid = sc.next();
            if (idNum(personid)) {
                break;
            } else {
                System.out.println("身份证号码错误重新输入");
                continue;
            }
        }
        String phonenumber = null;
        while (true) {
            System.out.println("输入手机号：");
            phonenumber = sc.next();
            if (number(phonenumber)) {
                break;
            } else {
                System.out.println("手机号码错误重新输入");
                continue;
            }
        }
        User user = new User(username, password1, personid, phonenumber);
        users.add(user);
        System.out.println("注册成功！");
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
            //获取一个验证码，随机
            String code = getCode();
            System.out.println("验证码是：" + code);
            //录入验证码
            System.out.print("请输入验证码：");
            String yzm2 = sc.next();
            if (code.equalsIgnoreCase(yzm2)) {
                //验证成功则跳出循环
            } else {
                System.out.println("验证码错误,重新输入");
            }
            if (users.get(index).getPassword().equals(password)) {
                break;
            } else {
                if (i == 2) {
                    System.out.println("密码错误次数过多，稍等再试");
                    return;
                }
                System.out.println("请输入正确的密码，您还有" + (2 - i) + "次机会。");
            }
        }

        //登录成功
        System.out.println("登录成功！");
        //创建对象，启动方法。
        StudentDemo sd = new StudentDemo();
        sd.startSystem();

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
        if (!(personid.equalsIgnoreCase(personid1) && PhoneNumber.equals(PhoneNumber1))) {
            System.out.println("验证失败，请重试");
            return;
        }
        String password;
        while (true) {
            System.out.print("验证通过，请输入新密码:");
             password = sc.next();
            System.out.print("请再次输入密码：");
            String againpassword = sc.next();
            if (password.equals(againpassword)){
                break;
            }else {
                System.out.println("两次密码不一致，请重新输入；");
                continue;
            }
        }
        //3.输入密码
        users.get(index).setPassword(password);


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

    //获取验证码
    public static String getCode() {
        ArrayList<Character> chats = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            chats.add((char) ('a' + i));
            chats.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(chats.size());
            sb.append(chats.get(i1));
        }

        //任意位置添加数字
        int i = random.nextInt(10);
        sb.append(i);
        char[] charArray = sb.toString().toCharArray();
        //随机索引
        int randomindex = random.nextInt(charArray.length);
        char c = charArray[randomindex];
        //char c1 = charArray[charArray.length];
        charArray[randomindex] = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = c;

        return new String(charArray);
    }
}
