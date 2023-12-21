package com.algorithmDemo.LambdaDemo;

import java.util.Arrays;

public class a03 {
    public static void main(String[] args) {
        //裴波那契(不死兔)
        //1 1 2 3 5 8 13
        //第一种方法
        System.out.println(getSum(12));
        int[] arr=new int[12];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
    //第二种方法，递归
    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return getSum(month - 1) + getSum(month - 2);
    }
}
