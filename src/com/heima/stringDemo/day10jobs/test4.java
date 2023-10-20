package com.heima.stringDemo.day10jobs;


import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        //长度为5，大小写字母数字。四个字母一个数字。数字可以出现在任意位置
        //char[] daxie={qwertyuiopasdfghjklzxcvbnm};
        char[] zimu ={'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        Random random = new Random();
        String sb = new String();
        int count = random.nextInt(5);
        for (int i = 0; i < 4; i++) {
            int r = random.nextInt(zimu.length);
            if(i==count){
                int i1 = random.nextInt(10);
                sb+=i1;
            }
            sb+=zimu[i];
        }
        System.out.println(sb);
    }
}
