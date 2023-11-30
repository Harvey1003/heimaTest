package com.heima.a01static;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("ydd",22,"man"));
        list.add(new Student("lcr",21,"man"));
        list.add(new Student("wkk",24,"man"));
        System.out.println(studentUtil.getMaxStudentAge(list));
    }
}
