package com.MyMap;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;

public class a04_map {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        Random r = new Random();
        String[] arr2=new String[80];
        //随机投票
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            arr2[i]=arr[index];
        }
        HashMap<String,Integer> hm = new HashMap<>();
        for (String name : arr2) {
            //判断map集合有没有景点名字
           if(hm.containsKey(name)){
               //存在
               Integer i = hm.get(name);
               i++;
               hm.put(name,i);
           }else{
               //不存在,景点名字第一次出现
               hm.put(name,1);
           }
        }
        int max=0;
        for (Map.Entry<String, Integer> it : hm.entrySet()) {
            Integer value = it.getValue();
            if (value>max){
                max=value;
            }
        }
        System.out.println(max);
        for (Map.Entry<String, Integer> ei : hm.entrySet()) {
           if(ei.getValue()==max){
               System.out.println(ei.getKey());
           }
        }

    }
}
