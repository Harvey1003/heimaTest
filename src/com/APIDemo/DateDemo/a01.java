package com.APIDemo.DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a01 {
    public static void main(String[] args) {
        //��ʽ��ʱ�䣬ָ����ʽ
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss E");
        System.out.println(sdf.format(new Date()));

        //
        String str="2000��10��03�� 00:00:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        Date d = null;
        try {
            d = sdf2.parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(d.getTime());
    }
}
