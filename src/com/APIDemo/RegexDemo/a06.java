package com.APIDemo.RegexDemo;

public class a06 {
    public static void main(String[] args) {
        String str="我要学学学学编编编编编编编编编编编编编程程程程程程程程程程程";
        System.out.println(str.replaceAll("(.)\\1++", "$1"));
    }
}
