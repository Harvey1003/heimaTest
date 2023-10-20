package com.heima.stringDemo.stringBuider;

import java.util.Scanner;

public class stringBuiderDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入字符串：");
        String s1 = sc.next();
        String s = new StringBuilder().append(s1).reverse().toString();
        if (s1.equals(s) ) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}