package com.APIDemo.IntegerDemo;

public class test3 {
    public static void main(String[] args) {
        System.out.println(toBinary(123));
    }

    private static String toBinary(int number) {
        //十进制转二进制
        //number%2
        StringBuilder sb = new StringBuilder();
        while (true){
            if (number==0){
                break;
            }
            int i = number % 2;
            sb.insert(0,i);
            number = number / 2;
            if (number<=0){
                break;
            }
        }
        return sb.toString();
    }
}
