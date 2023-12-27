package com.vesselDemo.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class a01 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet();
        s1.add("aaa");
        s1.add("ydd");
        s1.add("ydd");
        s1.add("lcr");
        System.out.println("-------µü´úÆ÷--------");
        Iterator<String> it = s1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------------------");
        System.out.println("-------ÔöÇ¿for--------");
        for (String s : s1) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        System.out.println("-------Lambda--------");
        s1.forEach(s -> System.out.println(s));
        System.out.println("-------------------");


    }
}
