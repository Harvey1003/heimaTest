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
//public static <T> void sort(List<T> list)排序
        Collections.sort(list);
        System.out.println(list);

//public static <T> void sort(List<T> list, Comparator<T> c)根据指定的规则进行排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);
        Collections.sort(list);

//public static <T> int binarySearch (List<T> list, T key)以二分查找法查找元素(需要元素有序)
        System.out.println(Collections.binarySearch(list, "a"));
//public static <T> void copy(List<T> dest, List<T> src)拷贝集合中的元素
//public static <T> int fill (List<T> list, T obj)使用指定的元素填充集合
//public static <T> void max/min(Collection<T> coll)根据默认的自然排序获取最大/小值
//public static <T> void swap(List<?> list, int i, int j)交换集合中指定位置的元素
        Collections.swap(list,0,1);
        System.out.println(list);
    }
}
