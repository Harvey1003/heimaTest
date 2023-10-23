package com.heima.arrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        Student s1 = new Student("zhangshan",232);
        Student s2 = new Student("lisi",23);
        student.add(s1);
        student.add(s2);
        student.add(new Student("wangwu",21));
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("ÊäÈëĞÕÃû£¬ÄêÁä£º");
            student.add(new Student(sc.next(), sc.nextInt()));
        }
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).getName()+","+student.get(i).getSex());
        }
    }
}
