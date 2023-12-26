package com.vesselDemo.collection.a01_ArrayList.test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        haskyDog list1=new haskyDog("哈士奇一号",12);
        ArrayList<haskyDog> listDog=new ArrayList<>();
        listDog.add(list1);
        keepPet(listDog);


        ArrayList<Cat> list2 = new ArrayList<>();
        list2.add(new lihuaCat("狸花猫一号",12));
        keepPet(list2);
    }

    public static void keepPet(ArrayList<? extends Animal> list){

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
             list.get(i).eat();
        }

    }
}
