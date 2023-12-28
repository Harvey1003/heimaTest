package com.vesselDemo.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class a05_Tree {
    public static void main(String[] args) {
        TreeSet<String> str = new TreeSet<>(
                (o1, o2) -> {
                    //按照长度排序
                    int i = o1.length() - o2.length();
                    //如果长度一样按照首字母排序，o1是String类型，String类里已经重写过compareTo方法了。
                    i = i == 0 ? o1.compareTo(o2) : i;
                    return i;
                }
        );
        str.add("abc");
        str.add("ac");
        str.add("ad");
        str.add("qwer");
        System.out.println(str);
    }
}
