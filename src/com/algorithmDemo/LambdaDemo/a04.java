package com.algorithmDemo.LambdaDemo;

public class a04 {
    public static void main(String[] args) {
        System.out.println(getnum(1));
    }

    public static int getnum(int day) {
        if (day == 10) {
            return 1;
        }

        return (getnum(day + 1) + 1) * 2;
    }

}
