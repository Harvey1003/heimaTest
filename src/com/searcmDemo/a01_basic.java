package com.searcmDemo;

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
}
