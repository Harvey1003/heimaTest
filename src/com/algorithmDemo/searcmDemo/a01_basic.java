package com.algorithmDemo.searcmDemo;

import java.util.ArrayList;

public class a01_basic {
    public static void main(String[] args) {
        int[] arr={23,123,123,441,1,2};
        System.out.println(basic1(arr, 123));
        ArrayList<Integer> list = basic2(arr, 123);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
    //1,基本查找，不考虑重复
    public static int basic1(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    //2基本查找，考虑重复
    public static ArrayList<Integer> basic2(int[] arr, int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                list.add(i);
            }
        }
        return list;
    }

    //3.二分查找、
    public static int basic3(int[] arr,int number){
        int min=0;
        int max=arr.length-1;
        while (true){
            if (min>max){
                return -1;
            }
            int mid=(min+max)/2;
            if (arr[mid]>number){
                max=mid-1;
            } else if (arr[mid]<number) {
                min=mid+1;
            }else {
                return mid;
            }
        }
    }
}
