package com.APIDemo.MathDemo;

import com.StudentSystemPlus.User;
import com.google.gson.Gson;

public class a01numberTest {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
           // int bai = i / 100 % 10;
            //int qian = i / 1000 % 10;
            double num = Math.pow(ge, 2) + Math.pow(shi, 2) ;
            if (i == num) {
                count++;
                System.out.println(num);
            }
        }
        System.out.println(count);
       // System.arraycopy();
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        int[] score={120,121,150};
        Student s1 = new Student("ydd",22,"man",score);
        Student s3 = new Student("ydd",22,"man",score);
        System.out.println(s1);


        //ǳ������������ֵַ�������ڲ��Ļ����������͡������������Ͷ��´����ֵַ�������������ͣ�new�ģ��иı䱻�����ĸı��Ӱ��ԭ����
        //ǳ�����������������Ϳ������ַ������ã�������������ȫ�����´����µġ�

        //���������ߣ����������Object�е�Clone������ǳ����
        Gson gson = new Gson();
        //�Ѷ������ַ���
        String s = gson.toJson(s1);
        //�ٰ��ַ������һ�����󣬴����µĶ���
        Student s2 = gson.fromJson(s, Student.class);
        System.out.println(s2);


    }


}
