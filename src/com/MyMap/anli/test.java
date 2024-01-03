package com.MyMap.anli;

import java.util.*;

public class test {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "郑州市", "周口市", "开封市");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "济南市", "青岛市", "威海市");

        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "南京市", "苏州市", "无锡市");

        hm.put("河南省", list1);
        hm.put("山东省", list2);
        hm.put("江苏省", list3);
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
