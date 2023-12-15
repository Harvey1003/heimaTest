package com.APIDemo.RegexDemo;

public class a04 {
    public static void main(String[] args) {
        //按照正则表达式的规则进行替换
        String s="小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String vs = s.replaceAll("[a-zA-Z0-9]+", "vs");
        System.out.println(vs);
        //按照正则表达式的规则切割字符串
        String[] split = s.split("[a-zA-Z0-9]+");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
