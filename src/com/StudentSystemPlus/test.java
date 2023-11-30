package com.StudentSystemPlus;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        String code = getCode();
        System.out.println(code);
    }

    //
    public static String getCode(){
        ArrayList<Character> chats = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            chats.add((char)('a' + i));
            chats.add((char)('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(chats.size());
            sb.append(chats.get(i1));
        }

        //任意位置添加数字
        int i = random.nextInt(10);
        sb.append(i);
        char[] charArray = sb.toString().toCharArray();
        //随机索引
        int randomindex = random.nextInt(charArray.length);
        char c = charArray[randomindex];
        //char c1 = charArray[charArray.length];
        charArray[randomindex]=charArray[charArray.length-1];
        charArray[charArray.length-1]=c;

        return new String(charArray);
    }

    //判断用户是否存在。
   // private static void checkUserinfo(ArrayList<> users,User userinof){}
}
