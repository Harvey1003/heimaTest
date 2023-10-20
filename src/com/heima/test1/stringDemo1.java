package com.heima.test1;

public class stringDemo1 {
    public static void main(String[] args) {
        String s1="abc";

        //数组转字符串
        char[] chs={'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println(s2);

        //字节数组转字符串 ，ascll码
        byte[] bytes={97,100,99};
        String s3 = new String(bytes);
        System.out.println(s3);
    //比较
        boolean equals = s1.equals(s2);
        boolean equals1 = s1.equals(s3);
        System.out.println(equals);
        System.out.println(equals1);
    }
}
