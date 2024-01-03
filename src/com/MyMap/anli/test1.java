package com.MyMap.anli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list);
        Random r = new Random();
        int i = list.get(r.nextInt(list.size()));
        String[] name={"nan1","nan2","nan3","nan4","nan5","nan6","nan7","nan8"};
        String[] nv={"nv1","nv2","nv3","nv4"};

        if (i==1){
            System.out.println(name[r.nextInt(name.length)]);
        }else {
            System.out.println(nv[r.nextInt(nv.length)]);
        }
    }
}
