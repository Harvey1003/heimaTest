package com.MyMap.anli;

import java.util.*;

public class test {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "֣����", "�ܿ���", "������");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "������", "�ൺ��", "������");

        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "�Ͼ���", "������", "������");

        hm.put("����ʡ", list1);
        hm.put("ɽ��ʡ", list2);
        hm.put("����ʡ", list3);
        for (Map.Entry<String, ArrayList<String>> sen : hm.entrySet()) {
            System.out.print(sen.getKey() + "=");
            StringJoiner sj = new StringJoiner(",","","");
            for (String s : sen.getValue()) {
                sj.add(s);
            }
            System.out.println(sj);
        }
    }
}
