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
        list.set(1,"bbb");//返回被覆盖的值
        //查询
        list.get(0);
        //获取长度,size()。list.fori自动遍历
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }


    }
}
