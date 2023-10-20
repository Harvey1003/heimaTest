package com.heima.stringDemo.day10jobs;

import java.util.Scanner;

public class idNumberYanZheng {
    public static void main(String[] args) {
        //号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
        String id = "11272320001003381X";
        if (idNum(id)) {
            System.out.println("验证通过");
        } else {
            System.out.println("验证失败");
        }
    }

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
