package com.APIDemo.IntegerDemo;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入一个整数：");
            int i = Integer.parseInt(sc.nextLine());
            if (i < 1 || i > 100) {
                System.out.println("超出范围");
                continue;
            }
            list.add(i);
            int sum=0;
            for (int i1 = 0; i1 < list.size(); i1++) {
                sum=sum+list.get(i1);
            }
            if (sum>=200){
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
