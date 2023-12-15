package com.APIDemo.DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a01 {
    public static void main(String[] args) {
        //格式化时间，指定格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        System.out.println(sdf.format(new Date()));

        //
        String str="2000年10月03日 00:00:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = null;
        try {
            d = sdf2.parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(d.getTime());
    }
}
