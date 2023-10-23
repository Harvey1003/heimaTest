package com.heima.arrayListDemo;

import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
phones.add(new Phone("xiaomi",1999.00));
phones.add(new Phone("iphone",5999.00));
phones.add(new Phone("huawei",6999.00));
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice()>=2000.00){
                System.out.println(phones.get(i).getBrand()+","+phones.get(i).getPrice());
            }
        }
    }
}
