package com.algorithmDemo.LambdaDemo;

import java.util.Arrays;

public class a03 {
    public static void main(String[] args) {
        //�Შ����(������)
        //1 1 2 3 5 8 13
        //��һ�ַ���
        System.out.println(getSum(12));
        int[] arr=new int[12];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
    //�ڶ��ַ������ݹ�
    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return getSum(month - 1) + getSum(month - 2);
    }
}
