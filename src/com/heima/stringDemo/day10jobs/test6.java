package com.heima.stringDemo.day10jobs;

public class test6 {
    public static void main(String[] args) {
        //���һ�����ʵ���ĸ���֣��������������˼��
        String s="hello worldas";
        int count=0;
        for (int i = s.length()-1; i >=0; i--) {
            char[] chars = s.toCharArray();
            if (chars[i]==' '){
                break;
            }count++;
        }
        System.out.println(count);
    }
}
