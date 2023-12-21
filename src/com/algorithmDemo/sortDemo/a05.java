package com.algorithmDemo.sortDemo;

import java.util.Random;

public class a05 {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        //printArr(arr);
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        if (start > end) {
            return;
        }
        int baseNum = arr[i];
        //用end当索引，从右往左开始遍历，找到比基准书小的数停下
        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < baseNum) {
                    break;
                }
                end--;
            }
            //用strat当索引，从左往右开始遍历，找到比基准数大的停下
            while (true) {
                if (start >= end || arr[start] > baseNum) {
                    break;
                }
                start++;
            }
            //相互交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //准基数归位
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
