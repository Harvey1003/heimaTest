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
        //��end����������������ʼ�������ҵ��Ȼ�׼��С����ͣ��
        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < baseNum) {
                    break;
                }
                end--;
            }
            //��strat���������������ҿ�ʼ�������ҵ��Ȼ�׼�����ͣ��
            while (true) {
                if (start >= end || arr[start] > baseNum) {
                    break;
                }
                start++;
            }
            //�໥����
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //׼������λ
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
