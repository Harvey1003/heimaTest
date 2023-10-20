package com.heima.stringDemo.day10jobs;

public class test5 {
    public static void main(String[] args) {
//给定两个字符串表示的非负整数 num1、num2 返回他们的乘积也用字符串表示
        String num1str = "12";
        String num2str = "3";
        int num = Integer.parseInt(num1str)*Integer.parseInt(num2str);
        String s = Integer.toString(num);
        System.out.println(s);
    }


}
