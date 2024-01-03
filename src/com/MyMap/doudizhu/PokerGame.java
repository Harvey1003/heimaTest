package com.MyMap.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    static ArrayList<String> list = new ArrayList<>();

    static {
        String[] color = {"红桃", "黑桃", "梅花", "方片"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "A", "2"};
        for (String s : color) {
            for (String n : number) {
                list.add(s + n);
            }
        }
        list.add("joker");
        list.add("JOKER");
    }

    public PokerGame() {
        Collections.shuffle(list);
        System.out.println(list);
    }
}
