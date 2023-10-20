package com.heima.stringDemo.stringBuider;

public class stringBuiderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(1).append(23123).append("app"); //添加元素
        sb.append(23231);
        sb.append("app");
        System.out.println(sb);//123231app
        sb.reverse();//反转
        System.out.println(sb);//ppa132321
        int length = sb.length();//长度
        sb.toString();//变回string

    }
}
