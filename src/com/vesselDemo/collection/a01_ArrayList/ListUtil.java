package com.vesselDemo.collection.a01_ArrayList;

import java.util.ArrayList;

public class ListUtil {

    public static <E> void addAll(ArrayList<E> list,E...e){
        for (E element : e) {
            System.out.println(element);
        }
    }
}
