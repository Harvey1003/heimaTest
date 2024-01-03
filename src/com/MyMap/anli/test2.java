package com.MyMap.anli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "ydd", "lcr", "lyh", "wkk", "pg", "hyk", "fhq");
        int size = list.size();
        ArrayList<String> list1 = new ArrayList<>();

        for (int j = 1; j <= 10; j++){
            System.out.println("µÚ"+j+"ÂÖ");
            for (int i = 0; i < size; i++) {
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                System.out.println(name);
                list1.add(name);
            }
            list.addAll(list1);
            list1.clear();
        }


    }
}
