package com.algorithmDemo.LambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class a01 {
    public static void main(String[] args) {
        Integer[] arr2={2,3,5,6,7,8};

        /*Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });*/

        //lambda���ʽ�������ڲ���
        Arrays.sort(arr2, ( o1, o2)-> o2-o1);
        //�����ַ����ĳ��Ƚ�������
        String [] str={"aa","a","aaaa","aaa"};
        Arrays.sort(str, ( o1,  o2)->  o1.length()-o2.length());
        System.out.println(Arrays.toString(str));
    }
}
