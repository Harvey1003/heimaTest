package com.heima.a01static;

import java.util.ArrayList;

public class studentUtil {
    private studentUtil(){}

    public static int getMaxStudentAge(ArrayList<Student> list){
        int max=list.get(0).getAge();

        for (int i = 1; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if(max<age){
                max=age;
            }
        }

        return max;
    }
}
