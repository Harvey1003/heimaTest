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
        //��������������
        Iterator<String> it = coll.iterator();
        //��ȡ��ǰλ���Ƿ���Ԫ�أ�����boolean
        while (it.hasNext()) {
            //��ȡ��ǰָ���Ԫ�ز��ƶ�ָ��
            System.out.println(it.next());
        }

    }}
