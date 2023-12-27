package com.vesselDemo.SetDemo;

import java.util.LinkedHashSet;

public class a03_LinkedHashSet {
    public static void main(String[] args) {
        Student s1 = new Student("lcr", 20);
        Student s2 = new Student("ydd", 20);
        Student s3 = new Student("lyh", 20);
        Student s4 = new Student("hyk", 20);

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s3);
        lhs.add(s2);
        lhs.add(s4);
        System.out.println(lhs);
    }
}
