package com.vesselDemo.SetDemo;
import java.util.TreeSet;

public class a04_TreeSet {
    public static void main(String[] args) {
        Student s1 = new Student("aaa", 25);
        Student s2 = new Student("bbb", 21);
        Student s3 = new Student("ccc", 22);
        //Student s4 = new Student("ddd", 23);

        TreeSet<Student> ts = new TreeSet<>();

        System.out.println(ts.add(s1));
        System.out.println(ts.add(s2));
        System.out.println(ts.add(s3));

        System.out.println(ts);

    }
}
