package com.APIDemo.MathDemo;

import com.StudentSystemPlus.User;
import com.google.gson.Gson;

public class a01numberTest {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
           // int bai = i / 100 % 10;
            //int qian = i / 1000 % 10;
            double num = Math.pow(ge, 2) + Math.pow(shi, 2) ;
            if (i == num) {
                count++;
                System.out.println(num);
            }
        }
        System.out.println(count);
       // System.arraycopy();
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        int[] score={120,121,150};
        Student s1 = new Student("ydd",22,"man",score);
        Student s3 = new Student("ydd",22,"man",score);
        System.out.println(s1);


        //浅拷贝：拷贝地址值，不管内部的基本数据类型、引用数据类型都会拷贝地址值，引用数据类型（new的）中改变被拷贝的改变会影响原对象。
        //浅拷贝：基本数据类型拷贝，字符串复用，引用数据类型全部重新创建新的。

        //第三方工具，深拷贝方法，Object中的Clone方法是浅拷贝
        Gson gson = new Gson();
        //把对象变成字符串
        String s = gson.toJson(s1);
        //再把字符串变成一个对象，传给新的对象
        Student s2 = gson.fromJson(s, Student.class);
        System.out.println(s2);


    }


}
