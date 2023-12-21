package com.algorithmDemo.ArraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class a01 {
    public static void main(String[] args) {

        //public static int binarySearch (数组，查找的元素)
        //二分查找法查找元素
        int[] arr={2,3,5,6,7,8};
        System.out.println(Arrays.binarySearch(arr, 2));
        //public static int[] copyof(原数组，新数组长度)拷贝数组

        //public static int[] copyofRange(原数组，起始索引，结束索引)

        //public static void fill(数组，元素)填充数组

        //public static void sort(数组)按照默认方式进行数组排序

        //public static void sort(数组，排序规则)按照指定的规则排序
        Integer[] arr2={2,3,5,6,7,8};
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //public static string toString(数组)
        // 把数组拼接成一个字符串
        System.out.println(Arrays.toString(arr2));

    }
}
