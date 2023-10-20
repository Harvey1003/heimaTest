package com.heima.stringDemo.day10jobs;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        //tochararr ´òÂÒ×Ö·û´®
        String str="abcdefg";
        Random random = new Random();
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
        for (int i = 0; i < chars.length; i++) {
            chars[i]=chars[random.nextInt(chars.length)];
        }
        String s = new String(chars);
        System.out.println(s);
    }
}