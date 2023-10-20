package com.heima.stringDemo.test;

public class stringTest01 {
    public static void main(String[] args) {
        String s = "helloword";
        //遍历字符串
        int index = s.length();
        for (int i = 1; i <= index; i++) {
            System.out.println(s.charAt(index - i));
        }

        //计数器asc码表
        int bigcount = 0;
        int numcount = 0;
        int count = 0;

        //i
        int[] arr = {1,22,3};
        String s1=arrofstring(arr);
        System.out.println(s1);

    }

    public static String arrofstring(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s =s+arr[i]+", ";
        }
        return s;
    }
}
