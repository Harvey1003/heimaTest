package com.MyMap;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class a03_hashMap {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(new Student("zhangsan",23),"henan");
        hm.put(new Student("lisi",24),"shandong");
        hm.put(new Student("wangwu",25),"hebei");
        hm.put(new Student("wangwu",25),"hebei");
        hm.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student+s);
            }
        });
    }
}
