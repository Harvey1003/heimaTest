package com.APIDemo.RegexDemo;

public class a06 {
    public static void main(String[] args) {
        String str="��Ҫѧѧѧѧ��������������̳̳̳̳̳̳̳̳̳̳�";
        System.out.println(str.replaceAll("(.)\\1++", "$1"));
    }
}
