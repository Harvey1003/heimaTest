package com.heima.arrayListDemo;

import java.util.ArrayList;

public class arrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //添加元素 返回值是布尔型
        list.add("aaa");
        list.add("aa");
        list.add("ab");
        //可以直接传数据，返回布尔
        list.remove("aa");
        //可以传索引,返回被删除的数据
        list.remove(2);
        //修改


    }
}
