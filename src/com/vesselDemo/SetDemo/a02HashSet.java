package com.vesselDemo.SetDemo;

import java.util.HashSet;

public class a02HashSet {
    public static void main(String[] args) {
        Student s1 = new Student("ydd", 22);
        Student s2 = new Student("lcr", 20);

        HashSet<Student> hs = new HashSet<>();

        //System.out.println(hs.add(s1));
        hs.add(s2);
        hs.add(s1);
        System.out.println(hs);
    }
}
