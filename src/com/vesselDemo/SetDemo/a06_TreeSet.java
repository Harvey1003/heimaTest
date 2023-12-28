package com.vesselDemo.SetDemo;

import java.util.TreeSet;

public class a06_TreeSet {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan", 23, 99.0, 100.0, 100.0);
        Student2 s2 = new Student2("lisi", 24, 90.0, 100.0, 100.0);
        Student2 s3 = new Student2("wangwu", 25, 100.0, 100.0, 100.0);

        TreeSet<Student2> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        for (Student2 t : ts) {
            System.out.println(t);
        }
    }
}
