package com.heima.arrayListDemo;

import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("xiaomi", 1999.00));
        phones.add(new Phone("iphone", 5999.00));
        phones.add(new Phone("huawei", 6999.00));
        ArrayList<Phone> phoneinfo = getPhone(phones);
        for (int i = 0; i < phoneinfo.size(); i++) {
            System.out.println(phoneinfo.get(i).getBrand());
        }
    }

    //返回多个结果，用集合
    private static ArrayList<Phone> getPhone(ArrayList<Phone> phones) {
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice() >= 2000.00) {
                resultList.add(phones.get(i));
            }
        }
        return resultList;
    }
}
