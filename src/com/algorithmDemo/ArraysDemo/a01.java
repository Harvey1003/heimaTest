package com.algorithmDemo.ArraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class a01 {
    public static void main(String[] args) {

        //public static int binarySearch (���飬���ҵ�Ԫ��)
        //���ֲ��ҷ�����Ԫ��
        int[] arr={2,3,5,6,7,8};
        System.out.println(Arrays.binarySearch(arr, 2));
        //public static int[] copyof(ԭ���飬�����鳤��)��������

        //public static int[] copyofRange(ԭ���飬��ʼ��������������)

        //public static void fill(���飬Ԫ��)�������

        //public static void sort(����)����Ĭ�Ϸ�ʽ������������

        //public static void sort(���飬�������)����ָ���Ĺ�������
        Integer[] arr2={2,3,5,6,7,8};
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //public static string toString(����)
        // ������ƴ�ӳ�һ���ַ���
        System.out.println(Arrays.toString(arr2));

    }
}
