package com.algorithmDemo.sortDemo;

import java.util.Random;

public class a03 {

    public static void main(String[] args) {
        //int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2};
        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        long start = System.currentTimeMillis();
        //System.out.println(start/1000/60/60/24/365);

        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        //从start开始遍历
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;

            //把从start遍历到的从左往右更前面的比较，大了不动，小了交换位置，比较到0索引为止。
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                //交换完位置后继续往前比较
                j--;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
