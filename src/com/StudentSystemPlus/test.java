package com.StudentSystemPlus;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        getCode();
    }

    //
    public static void getCode(){
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
        String code = sb.toString();
        System.out.println(code);
    }
}
