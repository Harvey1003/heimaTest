package com.sortDemo;

import java.util.Random;

import static com.sortDemo.a01.printArr;

public class a02 {
    public static void main(String[] args) {
        //—°‘Ò≈≈–Ú
        //int[] arr = {2, 5, 4, 1, 3};
        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        long start = System.currentTimeMillis();

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 1 + j; i < arr.length; i++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        //printArr(arr);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
