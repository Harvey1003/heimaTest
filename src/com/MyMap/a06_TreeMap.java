package com.MyMap;

import java.util.Map;
import java.util.TreeMap;

public class a06_TreeMap {
    public static void main(String[] args) {
        String str="aababcabcdabcde";
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (tm.containsKey(c)){
                int count = tm.get(c);
                count++;
                tm.put(c,count);
            }else {
                tm.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : tm.entrySet()) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        }
    }
}
