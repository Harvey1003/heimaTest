package com.APIDemo.RegexDemo;

public class a04 {
    public static void main(String[] args) {
        //����������ʽ�Ĺ�������滻
        String s="Сʫʫdqwefqwfqwfwq12312С����dqwefqwfqwfwq12312С�ݻ�";
        String vs = s.replaceAll("[a-zA-Z0-9]+", "vs");
        System.out.println(vs);
        //����������ʽ�Ĺ����и��ַ���
        String[] split = s.split("[a-zA-Z0-9]+");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
