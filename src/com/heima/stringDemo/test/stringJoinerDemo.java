package com.heima.stringDemo.test;

import java.util.StringJoiner;

public class stringJoinerDemo {
    public static void main(String[] args) {
        //stringJoiner sj = new stringJoiner();
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("1").add("2").add("3");
        int length = sj.length();
        sj.toString();
        System.out.println(sj);
    }
}
