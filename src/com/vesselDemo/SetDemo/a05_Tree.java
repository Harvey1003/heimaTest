package com.vesselDemo.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class a05_Tree {
    public static void main(String[] args) {
        TreeSet<String> str = new TreeSet<>(
                (o1, o2) -> {
                    //���ճ�������
                    int i = o1.length() - o2.length();
                    //�������һ����������ĸ����o1��String���ͣ�String�����Ѿ���д��compareTo�����ˡ�
                    i = i == 0 ? o1.compareTo(o2) : i;
                    return i;
                }
        );
        str.add("abc");
        str.add("ac");
        str.add("ad");
        str.add("qwer");
        System.out.println(str);
    }
}
