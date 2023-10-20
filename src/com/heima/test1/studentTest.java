package com.heima.test1;

import java.util.Scanner;

public class studentTest {
    public static void main(String[] args) {
        student[] arr = new student[3];
        student ydd = new student(1, "ydd", 22);
        student lcr = new student(2, "lcr", 22);
        student whw = new student(3, "whw", 22);
        arr[0] = ydd;
        arr[1] = lcr;
        arr[2] = whw;
        int index = getIndex(arr, 3);
        if (index >= 0) {
            arr[index] = null;
        } else {
            System.out.println("删除失败");
        }
        printArr(arr);
        int index2 = getIndex(arr, 2);
        if (index2 >= 0) {
            arr[index2].setAge(arr[index2].getAge() + 1);
        } else {
            System.out.println("修改失败");
        }
        printArr(arr);
    }

    //通过id删除学生信息
    public static int getIndex(student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void printArr(student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + arr[i].getName() + arr[i].getAge());
            }
        }
    }

}
