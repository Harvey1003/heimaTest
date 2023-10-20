package com.heima.test1;

import java.util.Random;

public class day10 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(4);
        String str = "holle";
        System.out.println(str.charAt(0));
        char[] chars = {str.charAt(0), str.charAt(1), str.charAt(2), str.charAt(3), str.charAt(4)};
        for (int i1 = 0; i1 < chars.length; i1++) {
            System.out.println(chars[i]);
        }
    }
}
