package com.APIDemo.IntegerDemo;

public class test2 {
    public static void main(String[] args) {
        //perseInt,�ַ���תint
        String str="1234";
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("��ʽ����");
        }
        int number=0;
        for (int i = 0; i < str.length(); i++) {
            int c = (str.charAt(i)-'0');
            number=number*10+c;
        }
        System.out.println(number);
    }
}
