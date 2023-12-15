package com.APIDemo.RegexDemo;

public class a05 {
    public static void main(String[] args) {
        //组号: 表示把第X组的内容再出来用一次,
        //捕获分组：\\x把第x组的内容再用一次

        //需求1: 判断一个字符串的开始字符和结束字符是否一致? 只考虑一个字符
        //举例:&abc& ,a123b,, a123a, b456b,17891
        String regex1="(.).+\\1";
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));

        //需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        //举例:abc123abc b456b 123789123
        String regex2="(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));

        //需求3:判断一个字符串的开始部分和结束部分是否一致? 开始部分内部每个字符也需要一致
        //举例:&&abc&&,aaa123aaa,bbb456bbb,111789111
        String regex3="((.){3}).+\\1";//((.)\2*).+\1
        System.out.println("aaaa123aaa".matches(regex3));
        System.out.println("bbb456bba".matches(regex3));
        System.out.println("111789111".matches(regex3));
    }
}
