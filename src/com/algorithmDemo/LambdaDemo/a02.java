package com.algorithmDemo.LambdaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class a02 {
    public static void main(String[] args) {
        Girl[] arr = {new Girl("ydd", 20, 1.70),
                new Girl("lcr", 19, 1.71),
                new Girl("wkk", 22, 1.70)};
        Arrays.sort(arr, (o1, o2) -> {
            double i = o1.getAge() - o2.getAge();
            i = i == 0 ? o1.getHeight() - o2.getHeight() : i;
            i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
            if (i > 0) {
                return 1;
            } else if (i < 0) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
