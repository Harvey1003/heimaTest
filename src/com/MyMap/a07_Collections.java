package com.MyMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class a07_Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        Collections.shuffle(list);
        System.out.println(list);
//public static <T> void sort(List<T> list)����
        Collections.sort(list);
        System.out.println(list);

//public static <T> void sort(List<T> list, Comparator<T> c)����ָ���Ĺ����������
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);
        Collections.sort(list);

//public static <T> int binarySearch (List<T> list, T key)�Զ��ֲ��ҷ�����Ԫ��(��ҪԪ������)
        System.out.println(Collections.binarySearch(list, "a"));
//public static <T> void copy(List<T> dest, List<T> src)���������е�Ԫ��
//public static <T> int fill (List<T> list, T obj)ʹ��ָ����Ԫ����伯��
//public static <T> void max/min(Collection<T> coll)����Ĭ�ϵ���Ȼ�����ȡ���/Сֵ
//public static <T> void swap(List<?> list, int i, int j)����������ָ��λ�õ�Ԫ��
        Collections.swap(list,0,1);
        System.out.println(list);
    }
}
