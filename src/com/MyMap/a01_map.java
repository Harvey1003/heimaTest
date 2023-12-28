package com.MyMap;

import java.util.HashMap;
import java.util.Map;

public class a01_map {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        //V put(K key,V value )添加元素/覆盖
        m.put("韦小宝","沐剑屏");
        m.put("尹志平","小龙女");
        m.put("郭靖","黄蓉");
        //如果key存在，则覆盖掉value，返回被覆盖的value
        String put = m.put("韦小宝", "双儿");
        System.out.println(m);
        //V remove(Object key)根据键则除键值对元素
        m.remove("尹志平");
        //void clear()移除所有的键值对元素
        m.clear();
        //boolean containsKey(object key)判断集合是否包含指定的键
        m.containsKey("尹志平");
        //boolean containsValue(Object value)判断集合是否包含指定的值
        m.containsValue("双儿");
        //boolean isEmpty()判断集合是否为空
        m.isEmpty();
        //int size()集合的长度，也就是集合中键值对的个数
        int size = m.size();


    }
}
