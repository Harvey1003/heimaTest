package com.MyMap;

import java.util.Comparator;
import java.util.TreeMap;

public class a05_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1;
            }
        });
        tm.put(1,"1");
        tm.put(1,"1");
        tm.put(2,"2");
        tm.put(3,"3");
        System.out.println(tm);
        /*tm.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer+"="+s);
            }
        });*/

    }
}
