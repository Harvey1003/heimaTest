package com.vesselDemo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class a01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        //创建迭代器对象
        Iterator<String> it = coll.iterator();
        //获取当前位置是否有元素，返回boolean
        while (it.hasNext()) {
            //获取当前指向的元素并移动指针
            System.out.println(it.next());
        }

    }}
