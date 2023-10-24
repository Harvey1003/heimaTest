package com.StudentSystem;

import java.util.ArrayList;

public class studentTest {
    public static void main(String[] args) {
        ArrayList<Student> sut = new ArrayList<>();
        sut.add(new Student("001","ydd",23,"zmd"));
        System.out.println(idinof(sut,"001"));

    }

    public static boolean idinof(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

}
